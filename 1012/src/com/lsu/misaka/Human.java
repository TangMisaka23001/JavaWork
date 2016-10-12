package com.lsu.misaka;

public class Human {
	private String name;
	private int age;
	static String country;
	static{
		country = "china";
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Human(String name) {
		super();
		this.name = name;
	}
	public void talk(String word){
		System.out.println(word);
	}
	public void run(){
		System.out.println("I'm running!");
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
