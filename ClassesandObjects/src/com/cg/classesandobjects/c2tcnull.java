package com.cg.classesandobjects;

public class c2tcnull {
    String name;

	public static void main(String[] args) {
		{
            Company c1 = new Company();
            c1.name = " C2TC ";
            System.out.println(c1.name);
            c1 = new Company();
            System.out.println(c1.name);

	}

}}
