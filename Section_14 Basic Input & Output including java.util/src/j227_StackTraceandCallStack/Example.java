package j227_StackTraceandCallStack;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int res  = divide();
		System.out.println("ans is "+ res);
		
	}
	
	private static int divide() {
		int x = getInt(); 
		int y = getInt();
		return x/y;
	}
	
	
	private static int getInt() {
		Scanner scanner =  new Scanner(System.in);
		return scanner.nextInt();
	}

}
