package j47_Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    
    private String name;
	private int hitPoints;
	private int strength;

	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	@Override
	public List<String> write() {
		List<String> list1 = new ArrayList<String>();
		list1.add(0, this.name);
		list1.add(1, "" + this.hitPoints);
		list1.add(2, "" + this.strength);
		return list1;
	}

	@Override
	public void read(List<String> savedvalues) {
		if (savedvalues != null && savedvalues.size() > 0) {
			this.name = savedvalues.get(0);
			this.hitPoints = Integer.parseInt(savedvalues.get(1));
			this.strength = Integer.parseInt(savedvalues.get(2));
		}

	}

	@Override
	public String toString() {
		return "Monster{name=" + "'"+name+"'" + ", hitPoints=" + hitPoints + ", strength=" + strength + "}";
	}
    
    
    

}
