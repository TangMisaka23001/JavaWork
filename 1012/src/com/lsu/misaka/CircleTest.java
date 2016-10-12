package com.lsu.misaka;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println("the area is :"+c.findArea(c.getRadius()));
	}

}
