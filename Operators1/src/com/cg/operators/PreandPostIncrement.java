package com.cg.operators;

public class PreandPostIncrement {

	public static void main(String[] args) {
		int a=5;
		int	b=2;
		int	c;
		int	d;
		c=++b; //line a b=3 and c=3
		d=a++; //line b d=5 a=6
		c++;   //line c=4
		System.out.println("a="+a + "b="+b +"c="+c + "d="+d );
		

	}

}
