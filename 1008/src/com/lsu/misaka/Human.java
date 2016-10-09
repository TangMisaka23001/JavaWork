package com.lsu.misaka;

public class Human {
	private String name;
	private int age;
	public void  talk(String word){
		System.out.println(word);
	}
	public void move(String s){
		System.out.println("Move to :"+s);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
