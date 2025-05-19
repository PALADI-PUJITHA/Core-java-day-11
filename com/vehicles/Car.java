package com.vehicles;

public class Car {
	private String brand;
	private String model;
	private double price;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public String model() {
		return model;
	}
	public double price() {
		return price;
	}
	public void showCarDetails() {
		System.out.println("Car brand: "+brand);
		System.out.println("Car model: "+model);
		System.out.println("Car peice: "+price);
	}
}
