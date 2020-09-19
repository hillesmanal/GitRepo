package com.pack.java;

public class Car {
	
	
	


	//Object Oriented Programming
	//1. Abstraction- 
	
	//2. Encapsulation- class is an example of encapsulation

	//3. Polymorphism- performing different actions
						// Method Overloading(Compile Time Polymorphism, Static Binding)- same method but with different parameter or no parameter
						// Method Overriding(RunTime Polymorphism or dynamic binding) -We will use in inheritance

	//4. Inheritance -- final, super


		String color;
		int numofwheels;
		int numofseats;
		
		//Rules for creating the constructor
		//1. Constructor name should be same as class name
		//2. Constructor should not have return type
		//3. Constructor should be public, 
		
		//-If you donot give any constructor, default constructor will be called
		
		//Line no.32 and 38 is Constructor overloading
		
		public Car() {
			
			System.out.println("Car constructor with no parameter");
			
		}

		public Car(String color, int numofwheels, int numofseats) {
			
			this.color = color;
			this.numofwheels = numofwheels;
			this.numofseats = numofseats;
		}

		public void speed()
		{
			System.out.println("Speed is 200 Km/hr");
		}
		
		public void speed(int value)
		{
			System.out.println("Speed is "+ value);
		}
		
		public void speed(int value,String description)
		{
			System.out.println(description+":"+value);
		}
		
		
		public void start()
		{
			System.out.println("Car started");
			
		}
		
		public void stop()
		{
			System.out.println("Car stopped");
			
		}
	


}
