package com.usa.polymorphism;

public class Overloading {

	public void getName(int salary) {
	System.out.println(salary);
	}
	
	public void getName(double bonus) {
	System.out.println(bonus);
	}
	public void getName(String name) {
	System.out.println(name);
	}
	public void getSalary() {
		System.out.println("concrete method ");
	}
	
	public static void main(String[] args) {
	
		Overloading obj = new Overloading();
		obj.getName(10000);
		obj.getName(500.00);
		obj.getName("hello");
		obj.getSalary();
		
		
	}
	
	
}
