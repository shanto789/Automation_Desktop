package com.usa.encapsulation;

public class Encapsulation {
private String name = " ami pagol hoye jacchi : ";
private  String situation= "ami jani na ";
private int salary = 1000;
private String getName() {
	return name;
}
private String getSituation() {
	return situation;
}
private int getSalary() {
	return salary;
}


public static void main(String[] args) {
	
	Encapsulation obj = new Encapsulation();
	System.out.println(obj.getSituation());
	System.out.println(obj.getSalary());
	System.out.println(obj.getName());
	
	
	
}


}
