

public class Test_Polymorphism {
	public static void main(String [] args) {
		
		Animal animal;
		
		animal  = new Bird();
		animal.talk();
		
		animal = new Dog();
		animal.talk();
		
		animal = new Cat();
		animal.talk();
		}	
}
									// Polymorphism 
class Animal  {
	public void talk() {
	System.out.println(" Animal talk with different sound");
	}
}


class Bird extends Animal {	
		public void talk() {
		System.out.println("Twitter");
	}
}
class Dog extends Animal{	
		public void talk() {
		System.out.println("Bark");
	}
}
class Cat extends Animal {	
		public void talk() {
		System.out.println("Meau");
	}
}
			
