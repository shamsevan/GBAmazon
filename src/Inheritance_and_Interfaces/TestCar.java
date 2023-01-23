package Inheritance_and_Interfaces;

public class TestCar {

	public static void main(String[] args) {

		BMW ob = new BMW();
		ob.start();
		ob.theftsafety();
		ob.stop();
		ob.refuel();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Car C = new BMW();
		c.stop();
		c.refuel();
		C.start();
		
		
		

		
		

	}

}
