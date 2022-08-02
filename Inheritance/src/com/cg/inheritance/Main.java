package com.cg.inheritance;

public class Main {

	public static void main(String[] args) {
		mobile mobileobj= new mobile("Windows","Windows","recent");
				System.out.println(mobileobj);
		android andobj= new android("android","android","5000");
					System.out.println(andobj);
		blackberry blackobj= new blackberry("blackberry","blackberry","key1;");
		System.out.println(blackobj);


	}

}
