package com.pack.java;


// OOPS concept



public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mercedes=new Car("black",4,4);
//		mercedes.color="black";
//		mercedes.numofseqA@ats=4;]			`!~11!1111
//		mercedes.numofwheels=4;
		
		System.out.println(mercedes.color);
		System.out.println(mercedes.numofseats);
		System.out.println(mercedes.numofwheels);
		
		mercedes.start();  //Abstraction
		mercedes.speed();
		mercedes.stop();
		
		
		Car ferrari=new Car();
		ferrari.color="red";
		ferrari.numofseats=5;
		ferrari.numofwheels=4;
		
		System.out.println(ferrari.color);
		System.out.println(ferrari.numofseats);
		System.out.println(ferrari.numofwheels);
		
		ferrari.start();
		ferrari.speed(300);
		
		ferrari.stop();
		
		ferrari.speed(0,"Car stopped");
		
		

	}

}
