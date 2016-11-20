package com.lsu.misaka;

public class Point {
	
	int x;
	int y;
	public Point(){
		x = (int)(Math.random()*10)%5;
		y = (int)(Math.random()*10)%5;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point){
			Point p = (Point)obj;
			if(p.getX() == x && p.getY() == y){
				return true;
			}else
				return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
