package com.lsu.misaka;

public class StringTest {

	
	public static void main(String[] args) {
		String a = "abcd";
		String b = "aswe";
		String c = "ABCD";
		System.out.println(a.charAt(0));
		System.out.println(a.compareTo(b));
		System.out.println(a.concat(b));
		System.out.println(a.indexOf("d"));
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
		System.out.println(a.replace("c", "d"));
		System.out.println(a.startsWith(b));
		System.out.println(a.substring(1, 2));
		System.out.println(a.split("x"));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.endsWith("d"));
	}
}
