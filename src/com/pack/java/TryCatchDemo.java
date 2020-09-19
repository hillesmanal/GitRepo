package com.pack.java;



//Throwable
//         -> Exception - Checked Exception(Compiler Exception-File Io Exception,  Interrupted Exception), 
//                        Unchecked Exception(RunTime Exception-Arithmetic Exception, ArrayIndexofBoundsException,Null Pointer Exception)
	
//        ->  Error- Cannot handle(JVM Error-Memory Leakage, Full Space on disk)

// throws- Suppressing the exception
// throw- u r giving ur own exception

 class MyException extends Throwable
{
	
	 public MyException()
	 {
		 System.out.println("User defined Exception");
	 }
	 
	 
}


public class TryCatchDemo {
	public static void tryMyCatch() {
		int []arr = {3,5,6,7};
		try {
			for (int i =0;i<=4; i++) {
				
			System.out.println(arr[i]);
			System.out.println("i am right ");
			}
			}
			catch(Exception e){
				System.out.println("I have got an exception ");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("always printed ");
			}
				
			}

	public static void main(String[] args) throws InterruptedException, MyException {
		// TODO Auto-generated method stub
		tryMyCatch();
   int a= 1;
   
   
	  Thread.sleep(3000);
   
  try {
	  int c= a/0;
	  
	  Thread.sleep(3000);
	 throw new ArithmeticException("This is the error");
	
  }
    catch (ArithmeticException e)
  {
     throw new ArithmeticException("This is the error");
    		
    	System.out.println(e);
    	 throw new MyException();
  }
//  catch (MyException e)
// {
//   	System.out.println(e);
// }
//  finally
//  {
//	  System.out.println("Always execute");
//  }
// 

  System.out.println("i want to see this statement");
  System.out.println("i want to see this statement");
		
	}


