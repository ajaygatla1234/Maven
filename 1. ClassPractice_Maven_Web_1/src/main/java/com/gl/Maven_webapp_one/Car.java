package com.gl.Maven_webapp_one;

public class Car {

	String brand;
	String color;
	double cost;
	
	public Car(String brand, String color, double cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
	
	
}
