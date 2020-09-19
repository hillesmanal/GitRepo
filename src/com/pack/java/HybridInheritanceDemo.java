package com.pack.java;


// This is Hybrid Inheritance example


// Rules- 
//Class to class extend is possible
//Interface extending interface  is possible
// Class extends interface is not possible, for class to use interface, we need to use implemrtns keyword

class A_Hybrid// extends B_Hybrid is not possible
{
	int a=5;
	
	public void displayA()
	{
		System.out.println("value of A is "+a);
	}
}
interface B_Hybrid// extends A_Hybrid class extending interface is not possible
{
	
int b=5;
	
	public void displayB();
	
	

	
	
}

interface C_Hybrid  extends B_Hybrid // is possible
{
int c=5;
	
	public void displayC();
	
	

}

class D_Hybrid extends A_Hybrid implements B_Hybrid, C_Hybrid
{
int d=5;
	
	public void displayC()
	{
		System.out.println("Value of c is "+ c);
	}

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("value of b is "+b);
	}

	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		System.out.println("value of a is"+a);
	}	
	public void displayD()
	{
		System.out.println("Value of d is "+ d);
	}
	
}



public class HybridInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D_Hybrid objd=new D_Hybrid();
		objd.displayA();
		objd.displayB();
		objd.displayC();
		objd.displayD();
		

	}

}
