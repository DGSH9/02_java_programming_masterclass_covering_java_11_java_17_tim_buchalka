package j47_Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
 
    
    private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	
	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}
	
	//getters and setters
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}



@Override
	public String toString() {
		return "Player{name=" + "'" + name+ "'" + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon=" + "'"+weapon+"'"
				+ "}";
	}



	@Override
	public List<String> write() {
	    
		List<String> list1 = new ArrayList<String>();
		list1.add(0, this.name);
		list1.add(1, ""+this.hitPoints);
		list1.add(2, ""+this.strength);
		list1.add(3, this.weapon);
	
		 
		return list1;
	
	    
	}

	@Override
	public void read(List<String> savedvalues) {
	    if (savedvalues != null && savedvalues.size() > 0) {
		this.name = savedvalues.get(0);
		this.hitPoints = Integer.parseInt(savedvalues.get(1));
		this.strength =Integer.parseInt( savedvalues.get(2));
		this.weapon = savedvalues.get(3);
	    }
	}
	
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	

}
