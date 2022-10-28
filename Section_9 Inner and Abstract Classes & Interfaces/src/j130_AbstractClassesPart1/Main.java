package j130_AbstractClassesPart1;

public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog("Rockey");
		dog.breathe();
		dog.eat();
		
		
		//Birds
//		Birds birds = new Birds("Woodcutter");
//		birds.breathe();
//		birds.eat();
		
		Parrot parrot = new Parrot("Moti");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		
		System.out.println("======================================>");
		Penguin penguin = new Penguin("Penguin_from_antraktika");
		penguin.breathe();
		penguin.eat();
		penguin.fly();
		
		
	}

}
