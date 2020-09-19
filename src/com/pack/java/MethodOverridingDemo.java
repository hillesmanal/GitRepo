package com.pack.java;

// For method overriding, my method name in base class and child class should be same, when u call the method with child object, child class method will be called
//super will call the parent class method

//final keyword for variable
//final keyword for method
//final keyword for class

//access specifier or access modifier- public,private,protected, default
//default - when i dont specify anything, by default, deafult modifier is applicable
//public-  accessible anywhere in or outside the package
// private- accessible in the same class only
//protected-  accesible in the same package but for other package, the class should be child class

class AM
{
	
 protected int a=5;
 
 private int privatevar=10;
	
	public  void display()
	{
		System.out.println("Value of A is "+ a);
	}
	
}

class BM extends AM
{
int b=5;


	
	public void display()
	{
		a=10;

		System.out.println("Value of b is "+ b);
		System.out.println(super.a)	;
		super.display(); //super will call the parent class method
	
	}	
	
	
}



public class MethodOverridingDemo {
	
	public int publicvar=10;
	int defaultvar=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BM objb=new BM();
		objb.a=10;
		objb.display();
		

	}

}
