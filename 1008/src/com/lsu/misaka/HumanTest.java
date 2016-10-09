package com.lsu.misaka;

public class HumanTest {
	public static void main(String[] args) {
		Human human = new Human();
		human.setAge(30);
		human.setName("ÕÅÈı");
		human.talk("hello I'm "+human.getName()+"  and my age is:"+human.getAge());
		human.move("right");
	}
}
