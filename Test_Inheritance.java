

public class Test_Inheritance {

	public static void main(String[] args) {

		Car car = new Car();
		Child_car child_car = new Child_car();

		car.move();
		child_car.move();

				}
										// Inheritance 
}

 class Car {

	public void move() {

		System.out.println(" Parent Car is very old ");
		System.out.println(" Parent Car can move ");
		System.out.println(" ");

	}

}
 class Child_car extends Car {
		public void move() {
		super.move(); // calling parent move() method
		System.out.println(" Child car can move");
	}

}
