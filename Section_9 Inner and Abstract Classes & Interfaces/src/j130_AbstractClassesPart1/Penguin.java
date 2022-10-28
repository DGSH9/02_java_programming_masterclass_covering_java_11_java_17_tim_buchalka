package j130_AbstractClassesPart1;

public class Penguin extends Birds{

	public Penguin(String name) {
		super(name);
		
	}


	@Override
	public void fly() {
		System.out.println("I m not good in flying...so i will go with swim..");
		
	}
	

}
