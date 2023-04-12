package com.usa.polymorphism;

public class Overridding_Exe extends Overridding {
	public void getName() {
		System.out.println("fdh srtuyr");	
		}
		public void getSalary() {
			System.out.println(10);
		}
	
	public static void main(String[] args) {
		Overridding_Exe obj = new Overridding_Exe();
	obj.getName();
	obj.getSalary();
	}
	
}
