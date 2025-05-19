package com.vehicles.app;
import com.vehicles.Car;
import com.vehicles.parts.Engine;
public class App {
	public static void main(String args[]) {
		Car car=new Car();
		car.setBrand("Ford");
		car.setModel("Mustang");
		car.setPrice(74.61000);
		Engine eng=new Engine();
		eng.setEngineType("5.0-liter Coyotote V8");
		eng.setHorsepower(480);
		car.showCarDetails();
		System.out.println();
		eng.showEngineDetails();
		
	}
}
