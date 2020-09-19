package com.pack.java;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class printtriangle {

	public static void main(String[] args) {
	Date d= new Date ();
	//System.out.println(d.toString());
	SimpleDateFormat sdf= new SimpleDateFormat("mm/dd/yyyy");
	System.out.println(sdf.format(d));
	}}
//		String rev= reverse("welcome");
//				System.out.println(rev);
////		int count= occurance("manaaalm",'a');
////			System.out.println(count);
//		}
//
//	private static String reverse(String str) {
//		// TODO Auto-generated method stub
//		String reve=" ";
//		
//	for(int i =str.length()-1;i>=0;i--) {
//			reve= reve+str.charAt(i);
//		}	
//		return reve;}}
	
//		int []arr= {2,4,7,3,9};
//		int temp;
//		for (int i =0;i<arr.length;i++){
//			for (int j = i+1;j<arr.length;j++) {
//				if(arr[j]<arr[i]) {
////					temp=arr[i];
////					arr[i]=arr[j];
////					arr[j]=temp;
//					arr[i]=arr[i]+arr[j]; 
//					arr[j]=arr[i]-arr[j];
//					arr[i]=arr[i]-arr[j];
//				}
//			}
//		
//		}
//		for (int i = 0;i<arr.length;i++) {
//		System.out.println(arr[i]);}
//	int []arr= {5,7,3,2};
//	int []arr1= {8,6,4,2};
//	 ArrayList<Integer> al=new ArrayList<Integer>();
//	
//	for (int i=0;i<arr.length;i++) {
//		if(arr[i]==arr1[i]) {
//			
//		 al.add(arr[i]);
//		
//		
//		}
//	
//	}
//	Object[] c=al.toArray();
//	System.out.println(c);
//		// TODO Auto-generated method stub
//		int k=1;
//		for (int i= 1; i <4;i++) {
//    	
//    	for (int j = 1; j<i+1;j++) {
//    		System.out.print(j*3);
//    		System.out.print("\t");
//    		k++;
//    	}
//    	System.out.println("");
//     }
//		//to reverse  s string 
//		String str= "manal";
//		String str1="";
//		for (int i =str.length()-1;i>=0;i--) {
//			System.out.println(str.charAt(i));
//			str1=str1+ str.charAt(i);
//			 
//		}
//		System.out.println(str1);

//	private static int occurance(String word, char character) {
//		// TODO Auto-generated method stub
//		int count=0;
//		for (int i =0;i<word.length();i++){
//			if(word.charAt(i)==character) {
//			count++;	
//			}
	
		
	
//-----------------------------------------------------------------------------------------------		
//	String 	str="manal";
/////
////StringBuilder stb= new StringBuilder (str);
////System.out.println(stb.reverse());
//		StringBuffer stb= new StringBuffer (str);
//		System.out.println(stb.reverse());
//--------------------------------------------------------------------------------------------------

//	
//	int []arr= {2,4,6,8};
//	int i =0;
//	int sum=0;
//	
//	while (i<arr.length) {
//		sum= sum+arr[i];
//		i++;
//	}
		
		
// multiply(5,10);
// System.out.println(multiply(5,10));
	
//	public static int multiply(int a,int b){
//		
//		int result= 0;
//		for (int i = 1;i<=b;i++) {
//			result=result+a;
//	
//	}
//		return result;
//	}
	//	diff();
	
	
//public static int  diff() {
//	int result=0;
//	int []arr= {1,4,6,8,9};
//	for (int i = 0;i<arr.length-1;i++) {
//		int sub=arr[i+1]-arr[i];
//	 if( arr[i+1]-arr[i]> result ) {
//		 result=sub;
//	 }
//	
//	}
//	System.out.println("ho");
//	return result;
