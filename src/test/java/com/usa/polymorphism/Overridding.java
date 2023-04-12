package com.usa.polymorphism;

public class Overridding {

	public void getName() {
	System.out.println("dhjskdfhs");	
	}
	public void getSalary() {
		System.out.println(1000);
	}
	public static void main(String[] args) {
		Overridding obj = new Overridding();
		obj.getName();
		obj.getSalary();
	}
}
