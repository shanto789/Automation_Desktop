package com.usa.inheritance;

public class Constractor {
	Constractor(String name){
		System.out.println(name);
	}
	
	Constractor(int bonus){
		System.out.println(bonus);
	}
	
	public static void main(String[] args) {
		Constractor obj = new Constractor(10000);
		
	}
	
}
