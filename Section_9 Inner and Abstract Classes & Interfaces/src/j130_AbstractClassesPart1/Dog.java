package j130_AbstractClassesPart1;

import j47_Interface.ISaveable;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	
	}

	@Override
	public void eat() {
		System.out.println(getName() + "is eating");
	}

	@Override
	public void breathe() {
		System.out.println("Breath in, Breath out, repeat");
	}
	
	
	

	
	
}
