package com.rajpro;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Car {
	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}

	public static void collide(final Car car) {
		System.out.println("Collided " + car.toString());
	}

	public void follow(final Car another) {
		System.out.println("Following the " + another.toString());
	}

	public void repair() {
		System.out.println("Repaired " + this.toString());
	}
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

	public ArrayList<Car> getCars(){
		ArrayList<Car> al=new ArrayList<Car>();
		Car c=new Car();
		c.setName("Maruti");
		al.add(c);
		Car c1=new Car();
		c1.setName("hundai");
		al.add(c1);
		return al;
	}
	public static void main(String[] args) {
		Car c=Car.create(Car::new);
		System.out.println("called repair");
		c.repair();
		System.out.println("--------------------");
		System.out.println("static method call print the cars");
		ArrayList<Car> cars = c.getCars();
		cars.forEach(Car::collide);
		System.out.println("Called non-static method print the cars");
		final Car police = Car.create( Car::new );
		cars.forEach( police::follow );
	}
}