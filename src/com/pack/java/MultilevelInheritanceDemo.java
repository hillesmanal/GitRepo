package com.pack.java;


// This is MultiLevel Inheritance example

class A_ML
{
	
	int a=5;
	
	public void displayA()
	{
		System.out.println("Value of A is "+ a);
	}
	
}

class B_ML extends A_ML
{
int b=5;
	
	public void displayB()
	{
		System.out.println("Value of b is "+ b);
	}	
	
	
}

class C_ML extends B_ML
{
int c=5;
	
	public void displayC()
	{
		System.out.println("Value of c is "+ c);
	}	
	
	
}



public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_ML objc=new C_ML();
		objc.displayA();
		objc.displayB();
		objc.displayC();

	}

}
