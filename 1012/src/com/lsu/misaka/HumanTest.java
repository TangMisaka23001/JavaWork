package com.lsu.misaka;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human("tom");
		System.out.println("I'm "+h.getName()+"  from"+Human.country);
		Human h1 = new Human("jack", 11);
		h1.run();
		h1.talk("hello");
	}

}
