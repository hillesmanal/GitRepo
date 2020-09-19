package com.pack.java;


// This is Single Inheritance example

class A
{
	
	static int a =5;
	
	public static void displayA()
	{
		System.out.println("Value of A is "+ a);
	}
	
}

class B extends A
{
int a=10;
	
	public void displayB()
	{
		System.out.println("Value of b is "+ a);
	}	
	
	
}



public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B objb=new B();
		objb.displayA();
		objb.displayB();

	}

}
