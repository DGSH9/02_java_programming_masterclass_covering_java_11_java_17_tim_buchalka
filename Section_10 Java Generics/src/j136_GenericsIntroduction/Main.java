package j136_GenericsIntroduction;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> itemsArrayList = new ArrayList<Integer>();
		itemsArrayList.add(1);
		itemsArrayList.add(2);
		itemsArrayList.add(3);
//		itemsArrayList.add("Durgesh");
		itemsArrayList.add(5);
		itemsArrayList.add(6);
		
		printDoubled(itemsArrayList);
	}
	
	public static void printDoubled(ArrayList<Integer> n){
		for(Object i:n) {	
			System.out.println((Integer) i*2);
		}
	}

}
