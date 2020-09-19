package com.pack.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//reverseArray();
//sortArray();
//removeDuplicate();
//largestNumber();
//smallestNumber();
//sumArray();
		int array[] = {1,5,6,9,5,4,3,9};
//insertZero(array);
deleteDuplicate(array);

		
	}

	
	private static void deleteDuplicate(int[] array) {
		// TODO Auto-generated method stub
		
		for (int i =0;i<array.length;i++) {
			for (int j=i+1;i<array.length;j++) {
				
				
				int count = 0;
				if (array[i]==array[j]) {
					count++;
				j--;
					
				}
				int newArray[]= new int [array.length-count];
				for (int n:newArray) {
					System.out.println(n);
				}
			}
		}
	}
	


	private static void insertZero(int array[]) {
		// TODO Auto-generated method stub
//		7.  WAP to insert a particular element in an array.
//		Example. int array[] = {1,5,6,9,5,4,3}
//		Insert 0 whenever 5 is found in the array.
//		Output = 1,5,0,6,9,5,0,4,3
		//int array[] = {1,5,6,9,5,4,3};
		int count =0;
		int number=5;
		for (int i=0;i<array.length;i++) {
			if(array[i]== number) {
				count++;
				
				
			}
		}
		
		int newArray []=  new int[array.length+count];
		int j=0;
		for (int i=0 ;i<array.length;i++) {
			newArray[j]=array[i];
			j++;
			if(array[i]==number) {
				newArray[j]=0;
				
				
				j++;
				
			
			//this method is replacing the number after 5 with 0 itis not inserting the zero after five .. I couldnt complete it //
			}
			
		
		}
		for (int n :newArray) {
		System.out.println(n);
		// couldn't print the number after the 0.. 0 is replacing the number after 5 not adding 
	}
	}
	private static void sumArray() {
//		// TODO Auto-generated method stub
//		6. Write a program to find the Sum of the elements in an array.
//		Example : int arr[] = { 1,5,4,6,9,3,2}
//		Output = 30
		int arr[] = { 1,5,4,6,9,3,2};
		int sum=0;
		for (int i =0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println(sum);
	}

	private static void smallestNumber() {
		// TODO Auto-generated method stub
//
//5. Write a program to find the Smallest number from the array.
//Example = int arr[] = {7,3,8,9,12,22,0,9,10}
//Output = 0
		int arr[] = {7,3,8,9,12,22,0,9,10};
		int smallest=arr[0];
		for(int i =0;i<arr.length;i++) {
			if (arr[i]< smallest) {
				smallest=arr[i];
			}
		}
System.out.println(smallest);
	}

	private static void largestNumber() {
		// TODO Auto-generated method stub
//		. Write a program to find the Largest number from the array.
//		Example = int arr[] = {7,3,8,9,12,22,0,9,10}
//		Output = 22
		 int arr[] = {7,3,8,9,12,22,0,9,10};
		 int largest=arr[0];
		 for(int i = 0;i<arr.length;i++)
		 {
			if (arr[i]>largest) {
				largest=arr[i];
			}
		 }
		System.out.println(largest);
	}

	private static void removeDuplicate() {
		// TODO Auto-generated method stub
//		Write a Program to remove the duplicate elements in an array.
//		Example : int arr[] = {3,4,1,2,4,6,2,8,1,7}
//		Output = 3,4,1,2,6,8,7
		int count = 0;
		if (arr[i])
		int arr[] = {3,4,1,2,4,6,2,8,1,7};
		int arr2[]= new int[]
		//List <Integer> al= new <List<Integer>> ArrayList();
		for (int i =0;i<arr.length;i++) {
			for (int j =i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					if (!al.contains(arr[i])) {
					al.add(arr[i]);
					// i couldn't print the number 7 
						
					}
					
				}
			}
			
		}
		System.out.println(al);
		}
	

	private static void sortArray() {
		// TODO Auto-generated method stub
		int temp;
		int arr[] = {1,4,3,7,8,2,6,5};
		for (int i =0;i<=arr.length-1;i++) {
			for (int j=i+1;j< arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;	
			}
			
			}
			System.out.println(arr[i]);
			
			//How to print an array ??//
			}
		}
	}

	//private static void reverseArray() {
		// TODO Auto-generated method stub
//		 Write a program to reverse the array without using inbuilt function.
////		 Example : int[] arr = {1,4,3,7,8,2,6,5}
////		 Output =  5,6,2,8,7,3,4,1
//		int[] arr = {1,4,3,7,8,2,6,5};
//		ArrayList al= new <Integer> ArrayList();
//		int swap;
//		//List <Integer> arr2 = new <Integer> ArrayList();
//		int  last =arr.length-1;
//		for (int i =arr.length-1;i>0; i--) {
//			System.out.print(arr[i]+",");
//			
			

	

