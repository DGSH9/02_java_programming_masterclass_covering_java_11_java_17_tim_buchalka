package j130_AbstractClassesPart1;

public abstract class Birds extends Animal{

	public Birds(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is picking..");
		
	}

	@Override
	public void breathe() {
		System.out.println("breathe in, breathe out, repeat..");
	}
	
	
	public abstract void fly();
	
}
