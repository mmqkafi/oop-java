

public class Test_Encapsulation {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Nils");
		person.setAge(23);
		
		System.out.println("Person name is :" + person.getName());
		System.out.println("Person age is: " + person.getAge());
		
		
								// Encapsulation 
	}

}

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}


