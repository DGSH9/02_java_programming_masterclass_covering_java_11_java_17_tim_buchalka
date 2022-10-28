package j127_Inner_classes_Part_1_and_2;

public class Main {
	public static void main(String[] args) {
		
		GearBox gearBox = new GearBox(6);
		GearBox.Gear firstGear = gearBox.new Gear(1, 12.3);
		System.out.println(firstGear.driveSpeed(1000));
	
	}
}
