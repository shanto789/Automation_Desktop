package com.usa.array;

import java.util.Arrays;

public class Arra_2 {

	public void getSingle(){
		int num[]= {5,6,9,8,7,12,65,4,5};
		//if we need all the value
		//System.out.println(Arrays.toString(num));
		//if we need only single value

		//System.out.println(num [5]);
		//in lenth only can print last single value 
		//for (int i =8; i < num.length; i++) {
			//System.out.println(num[i]);
			//in lenth only can print first single value 
			
			
		
		//for (int i =0; i < num.length; i--) {
			//in lenth only can print first single value 
			//System.out.println(num[i]);
			
			//for (int i =0; i < 100; i++) {
			//if we want to print out 0 to 100
			//System.out.println(i);
			//}

		for (int i =100; i > 1; i--) {
			//if we want to print out 100 to 0
			System.out.println(i);
		}
		}

		

	
	
	
	public static void main(String[] args) {
		Arra_2 obj = new Arra_2();
		obj.getSingle();
	}
	
	
	
}