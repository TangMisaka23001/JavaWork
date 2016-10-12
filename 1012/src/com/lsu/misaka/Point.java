package com.lsu.misaka;

public class Point {
	
	
	private int x;
	private int y;
	public double distance(int x,int y){
		return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
	}
	public Point move(int x,int y){
		this.setX(this.x+x);
		this.setY(this.y+y);
		return this;
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
	
}
