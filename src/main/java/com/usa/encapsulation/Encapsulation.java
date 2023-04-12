package com.usa.encapsulation;

public class Encapsulation {
private String name = " ami saturday pore pagol hoye jai ";
private String name1 = " ami jani na ";
private int salary = 1000;
private String getName() {
	return name;
}
private String getName1() {
	return name1;
}
private int getSalary() {
	return salary;
}
public static void main(String[] args) {
	
Encapsulation obj = new Encapsulation();
System.out.println(obj.getName());
System.out.println(obj.getName1());
System.out.println(obj.getSalary());


}
}










