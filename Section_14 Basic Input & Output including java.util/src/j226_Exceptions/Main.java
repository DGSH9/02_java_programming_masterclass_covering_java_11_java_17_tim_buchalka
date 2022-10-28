package j226_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x = 20;
		int y = 0;
		System.out.println(divideLBYL(x, y));
		System.out.println(divideEAFP(x, y));
//		System.out.println(divide(x, y));
//		int z = getInt();
//		int z = getIntLBYL();
		int z = getIntEAFP();
		System.out.println("x is " + z);
	}

	// user input
	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	// user input
	private static int getIntLBYL() {	
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		System.out.println("Eneter Character...");
		String inputValue = scanner.next();
		for (int i = 0; i < inputValue.length(); i++) {
			if (!Character.isDigit(inputValue.charAt(i))) {
				check = false;
				break;
			}	
		}
		if (check) {
			return Integer.parseInt(inputValue);
		}
		return 0 ;

	}
	
	// user input
	private static int getIntEAFP() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please eneter Integer...");
		try {
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			return 0;
		}
	}
	
	
	
	private static int divideLBYL(int x, int y) {
		if (y != 0) {
			return x / y;
		} else {
			return 0;
		}
	}

	private static int divideEAFP(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	private static int divide(int x, int y) {
		return x / y;
	}
}
