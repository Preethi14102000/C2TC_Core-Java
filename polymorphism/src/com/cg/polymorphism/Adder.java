package com.cg.polymorphism;

public class Adder {
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(11,11));
		System.out.println(add(11.12,11.34));
		

	}

}
