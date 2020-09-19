package com.pack.java;

public class Assignmet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  1
//
//	      23
//
//	      456
//
//	      7891
		printPatern1();
//printPattern2();
//printPattern3();
//printPattern4();
//printPattern5();
		

		
	}

	private static void printPattern5() {
		// TODO Auto-generated method stub
//		print the pattern 
//		  1
//	      22
//	      333
//	      4444
//	      55555
//	      4444
//	      333
//	      22
//	      1
		int k=0;
	for (int i = 1;i<10;i++) {
		if (i<=5) {
			for (int j=i;j>=1;j--) {
				System.out.print(i+ " ");
			}
			System.out.println("\n");
		}
		else{
			for(int j=10-i;j>=1;j--) {
		
			System.out.print(10-i +" ");		
			}
		System.out.println("\n");
		}}
			
	
	
	}

	private static void printPattern4() {
		// TODO Auto-generated method stub
		for (int i =1;i<=5;i++) {
			for (int j = 1;j<=i;j++) {
			if (i%2!=0) {
			System.out.print("*" +" ");
			}
			else {
			System.out.print("#"+" ");
	
			}
			
			}
			System.out.println("\n");
			}
		}
	

	private static void printPattern3() {
		// TODO Auto-generated method stub
//		print this pattern
//		  55555
//        4444
//	      333
//	      22
//	      1
		
		for (int i=5;i>=1;i--) {
			for (int j =i;j >=1;j--) {
				System.out.print(i+" ");
			}
			System.out.println("\n");
		}
	
	}

	private static void printPatern1() {
		// TODO Auto-generated method stub
//		print pattern
//		 1
//	     23
//	     456
//	     78910
		int k=1;
		for (int i = 1;i<=4;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print(k+" ");
				++k;
			}
			System.out.println("\n");
		
		}
	
	}

	private static void printPattern2() {
//		print this pattern   
//		1
//      22
//      333
//      4444
//
//	      55555
		// TODO Auto-generated method stub
	
		for (int i =1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+ " ");
				//System.out.println();
				
				
			}
			System.out.println("\n");
		}
		
	}

}
