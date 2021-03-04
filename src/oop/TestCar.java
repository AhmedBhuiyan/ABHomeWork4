package oop;

import oop.Car;
import oop.Mercedes;
import oop.Toyota;

public class TestCar {

	public static void main(String[] args) {
		Car Corolla=new Toyota();
			
			Corolla.Start();
			Corolla.Stop();
			
			
		Car Series5=new Mercedes();
			
			Series5.Start();
			Series5.Stop();
			
		
		Toyota Camry=new Toyota();
			Camry.Wheel();

		
		
		Mercedes Series4=new Mercedes();
			Series4.CarBody();
	}

}


