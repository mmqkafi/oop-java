

public class Method_Overloading {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.walk();
		tiger.walk(3);
		tiger.walk("Nils");
	}


}
class Tiger{                     // method overloading
	public void walk()
	{
		System.out.println("Cat can walk");
	}

	public void  walk(int i)
	{
		System.out.println("Cat age:" + i);
	}

	public void walk(String name)
	{
		System.out.println("Cat name is: " + name);
	}
}



