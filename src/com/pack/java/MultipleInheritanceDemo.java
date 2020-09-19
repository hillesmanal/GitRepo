package com.pack.java;


// This is Multiple Inheritance example

interface A_MI
{
	
	int a=5;
	
	public void displayA();
	
	
}

interface B_MI 
{
int b=5;
	
	public void displayB();
	
	
	
}

class C_MI implements A_MI, B_MI
{
int c=5;
	
	public void displayC()
	{
		System.out.println("Value of c is "+ c);
	}

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println(b);
	}

	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}	
	
	
}



public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_MI objc=new C_MI();
		objc.displayA();
		objc.displayB();
		objc.displayC();

	}

}
