package com.vehicles.parts;

public class Engine {
	private String engineType;
	private int horsePower;
	public void setEngineType(String engineType) {
		this.engineType=engineType;
	}
	public void setHorsepower(int horsePower) {
		this.horsePower=horsePower;
	}
	public String getEngineType() {
		return engineType;
	}
	public int getHorseType() {
		return horsePower;
	}
	public void showEngineDetails() {
		System.out.println("Engine Type: "+engineType);
		System.out.println("Engine Horsepower: "+horsePower);
	}
}
