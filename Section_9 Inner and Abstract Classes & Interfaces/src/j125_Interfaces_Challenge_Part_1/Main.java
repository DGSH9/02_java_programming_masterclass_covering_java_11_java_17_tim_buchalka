package j125_Interfaces_Challenge_Part_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		ISaveable iSaveablePlayer;
		iSaveablePlayer = new Player("Durgesh", 25, 100);
		
		//calling write
		List<String> list1 = new ArrayList<String>();
		list1 = iSaveablePlayer.write();
		System.out.println(list1);

		
		//calling read
		iSaveablePlayer = new Player();
		List<String> list2 = new ArrayList<String>();
		list2.add(0, "Ramesh");
		list2.add(1, "30");
		list2.add(2, "200");
		list2.add(3, "Rohit");
		iSaveablePlayer.read(list2);
		System.out.println(iSaveablePlayer.toString());
		
		
		
		
	}

}
