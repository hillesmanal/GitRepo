package com.pack.java;

import java.util.ArrayList;

public class CodingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  int ar[]= {6,9,3,5,1};
		  int[] arr1= {7,4,2,5,8,1};
	        int[] arr2= {4,7,2,5,1,0};
	       
;
	      //  int sum=sumArray(ar);
		//int multiply= multipyFive();
		
		 //compareArray(arr1, arr2);
 		  //System.out.println(sum);
		//System.out.println(multiply);
//sortArray();
//pyramid();
reverseString();
			}
	public static int sumArray(int ar[]) {
		  int sum=0;
		  for (int i= 0 ;i<ar.length;i++) {
			 sum= sum+ar[i]; 
		  }
		  return sum;
	}
	public static int  multipyFive()
	{
		int multiply = 0;
		for (int i = 1;i<=10;i++) {
			multiply=multiply+5;
		}
		return multiply ;
	}
	public static void compareArray(int arr1[],int arr2[]) {
		 ArrayList<Integer> al= new ArrayList<Integer>();
		 for (int i =0;i< arr1.length ;i++) {
			 if (arr1[i]==arr2[i]) {
				al.add(arr1[i]) ;
			 }
		 }
		Object []c= al.toArray();
		for (Object ob:c) {
			System.out.println(ob);	
		}
		    
	}      
	
	public static void sortArray() {
		  int[] arr3= {7,4,2,5,8,1};
		
		  int swap;
		  int k=0;
		for (int i =0;i<arr3.length; i++)
		{for (int j=i+1;j<arr3.length;j++) {
			if( arr3[i]>arr3[j]) {
//				swap=arr3[i];
//				arr3[i]=arr3[j];
//				arr3[j]=swap;
				arr3[i]=arr3[i]+arr3[j];
				arr3[j]=arr3[i]- arr3[j];
				arr3[i]=arr3[i]-arr3[j];		
				k++;
			
		}}}
			
	for (int i =0;i<=i;i++) {
		System.out.println(arr3[i]);
	}
		}
	public static void pyramid() {
		//int k = 1;
		
		 for (int i = 1; i<=5;i++) {
			 System.out.println("*");
			 for (int j=1; j<=i; j++) {
				 System.out.println("*");
				 System.out.println("\t");
			 }
			 System.out.println();
		 }
		
	}
	public static void fibochin() {
		
		int a= 0;
		int b= 1;
		int sum=0;
		for (int i = 1; i<=9; i++) {
		a= a+b;
		a=sum;
		}
		}
	public static void reverseString() {
		String str = "Manal";
		int i = str.length()-1;
		while (i>=
		0) {
			System.out.println(str.charAt(i));
			i--;
		}
	}
	}
	
	
	



