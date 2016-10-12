package com.lsu.misaka;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		p1.setX(1);
		p1.setY(1);
		p2.setX(2);
		p2.setX(2);
		System.out.println("Point1("+p1.getX()+","+p1.getY()+")");
		System.out.println("Point2("+p2.getX()+","+p2.getY()+")");
		System.out.println("the distance is :"+p1.distance(p2.getX(), p2.getY())); 
		p1.move(1,1);
		System.out.println("Point1 after move:("+p1.getX()+","+p1.getY()+")");
	}

}
