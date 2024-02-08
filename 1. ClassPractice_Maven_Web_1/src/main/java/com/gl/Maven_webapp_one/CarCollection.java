package com.gl.Maven_webapp_one;

import java.util.ArrayList;

public class CarCollection {

	public ArrayList<Car> carCollection() {
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		Car c1=new Car("Ferrari", "Red", 129898.498);
		Car c2=new Car("Lambo", "Purple", 1639898.878);
		Car c3=new Car("Maseratti", "Blue", 1989898.87786);
		
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		
		return carList;

	}

}
