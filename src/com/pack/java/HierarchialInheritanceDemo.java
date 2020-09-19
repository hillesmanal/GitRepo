package com.pack.java;


// This is MultiLevel Inheritance example

class A_HL
{
	
	int a=5;
	
	public void displayA()
	{
		System.out.println("Value of A is "+ a);
	}
	
}

class B_HL extends A_HL
{
int b=5;
	
	public void displayB()
	{
		System.out.println("Value of b is "+ b);
	}	
	
	
}

class C_HL extends A_HL
{
int c=5;
	
	public void displayC()
	{
		System.out.println("Value of c is "+ c);
	}	
	
	
}



public class HierarchialInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_HL objc=new C_HL();
		objc.displayA();
	//	objc.displayB();
		objc.displayC();

	}

}
