package com.pack.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {4,7,6,4,6,6};	
 ArrayList< Integer> al=new ArrayList<Integer>();
 for (int i =0;i<a.length; i++)
		 if(!al.contains(a[i])) {
			al.add(a[i]);
			
			 for(int j =0;j<a.length; j++) {
				 if (a[i]==a[j]) {
					 
				 }
			 }
	 //    Map <Integer,Integer> hm= new HashMap<Integer,Integer>();
//hm.put(3, 6);
//hm.put(6, 8);
//hm.put(2,7);
//
//
//Set sn= hm.entrySet();
//Iterator it= sn.iterator();
//while(it.hasNext()){
//	Map.Entry mp= (Map.Entry)it.next();
//	System.out.println(mp.getValue());
//	System.out.println(mp.getKey()); 

}

	};


}
