package j47_Interface;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Main {
	public static void main(String[] args) {
		
		ISaveable iSaveablePlayer;
		iSaveablePlayer = new Player("Durgesh", 25, 100);
		
		//calling write
		List<String> list1 = new ArrayList<String>();
		list1 = iSaveablePlayer.write();
		System.out.println( (( Player)(iSaveablePlayer)).toString());

		
		
		
		//monster class
		ISaveable wereWolfI;
		wereWolfI = new Monster("WereWolf", 20, 900);
		System.out.println("name = " + ((Monster) wereWolfI).getName());
		
		System.out.println(wereWolfI.toString());
		
		
		
	}

}
