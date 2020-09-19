package com.pack.java;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
	int lent=input.length;
	for(int i = 0;i<lent;i++) {
		for(int j=i+1;j<=lent;j++) {
			if (input[i]==input[j]) {
				
			}
			else {
				input[j]=input[j+1];
				//lent--;
				j--;
				System.out.print(" "+ input[i]);
			}
		}

	}
	
	int[] output= new int[input.length ];
//		int current = input[0];
//		boolean found = false;
//
//		for (int i = 0; i < input.length; i++) {
//		    if (current == input[i] && !found) {
//		        found = true;
//		    } else if (current != input[i]) { 
//		        System.out.print(" " + current);
//		        current = input[i];
//		        found = false;
//		    }
//		}
//		System.out.print(" " + current);
	}

}
