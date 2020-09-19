package com.pack.java;

public class Human {
	
	


   int  height;
   int  weight;
   String eyeColor;
   String hairColor;
   //constructor overloading( Compile Time Polymorphism)
   public Human() {
	   System.out.println("I am a constructor with no paramerter");
   }
   
   
	
	public Human(int height, int weight, String eyeColor, String hairColor) {
	
	this.height = height;
	this.weight = weight;
	this.eyeColor = eyeColor;
	this.hairColor = hairColor;
}

	public void eat() {
		System.out.println(" food");
	}
	public void eat(int meals, int calories) {
		System.out.println("meals and calories ");
	}
	public void  walk() {
		System.out.println(" 5 miles ");
	}
    public void  play() {
    	System.out.println("playing soccer ");
    }

}