package com.pack.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//Array vs Arraylist:
//
//-	Array has fixed size whereas arraylist is dynamic.
//-	If array is defined as String, only string element can be added in it whereas in arraylist, if we donot define any datatype in angular brackets, we can add elements of different datatypes.
//-	In arrays, we cannot insert or remove element at any index whereas in arraylist, we can.
//-	7Arraylist and arrays both can accept duplicate values.


 

// Collections- has interface and classes- helps in storing and processing the data
//-	In array, we cannot delete or insert data, so to implement this functions, 
//- We use classes and interfaces given by java collections framework.-	

//Types of Collection
//Interfaces- List, Set, MAP
//Classes- ArrayList,LinkedList,Vector class which implements List Interface
//HashSet,LinkedHashSet, TreeSet class which implements the Set interface
// HashMap,LinkedHashMap, TreeMap class implements MAP interface

//List Interface:	
//-	A list is an ordered Collection(sometimes called a sequence). Lists may contain duplicate elements.
//-	In arraylist, elements are stored in sequential order.
//-	ArrayList, LinkedList, Vector implement List interface.
//-	Suppose you want to insert element between indexes or want to delete element, then we can use list interface.


//Set Interface:
//-	A set is a Collection that cannot contain duplicate elements.
//-	There is no guarantee that element is stored in sequential order. They are stored in random order. Therefore, we cannot use index of method in set.
//-	In set, user can add or remove elements. They cannot insert between index as there is no guarantee in order.
//-	HashSet, LinkedHashset, TreeSet implement Set interface.

//Map Interface:
//-	This interface takes the values in the form of key value pair.
//-	We map key to the value. IF you specify key which is not present, null value will be printed.
//-	To get key and value as separate value, Map.Entry  is used.
//-	Because values are stored as key value pair, to separate the key and value, we need to use  getKey() and getValue() method

//HashTable vs HashMap:
//-	Hashmap is not synchronized and not thread safe. That means, if  5 threads are accessing the hashmap, then all 5 programs access the hashmap at the same time, that means it is not synchronized and not thread safe.
//-	HashTable is  synchronized and  thread safe. That means, if  5 threads are accessing the hashtable, then if 1 program or thread access the hashtable then other threads need to wait tiill the first one finished, that means it is synchronized and thread safe.
//-	Use hashmap when application doesnot require to do multithreading task, and hashtable should be used in multithreading application.
//
//-	Hashmap allows one null key and any number of null values where as hash table doesnot allow null keys and null values.
//
//-	Hashmap object values are iterated by using iterator whereas hashtable is the only class other than vector which uses enumerator to iterate the values of hashtable object.
//





public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//	HASHTABLE<STRING, INTEGER> HTPHONEBOOK= NEW HASHTABLE<STRING, INTEGER>();
//		
//		HTPHONEBOOK.PUT("ABC", 123566789);
//		HTPHONEBOOK.PUT("XYZ", NULL);
//		HTPHONEBOOK.PUT(NULL, NULL);
//		HTPHONEBOOK.PUT(NULL,NULL);
//		
		//
		//
		//SYSTEM.OUT.PRINTLN(HTPHONEBOOK);
//			
		sortArray();
		
		Map<String, Integer> phonebook= new HashMap<String, Integer>();
		


		
		phonebook.put("xyz", 13);
		phonebook.put("lmn",12);
		System.out.println(phonebook);
		
		//to get value based on key
		System.out.println(phonebook.get("xyz"));
		
		//IF you specify key which is not present, null value will be printed.
		System.out.println(phonebook.get("xz"));
//		
//		//remove value with the help of key,
//		System.out.println(phonebook.remove("pqr"));
//		
//		System.out.println(phonebook);
		
		
		//Entryset- return entry
		
		Set pbs =phonebook.entrySet();
		Iterator it1 = pbs.iterator();
		while(it1.hasNext()) {
		 Map.Entry map= (Map.Entry)it1.next();
		System.out.println(map.getKey());
		System.out.println(map.getValue());}
				Set s=phonebook.entrySet();// convert map into set
				
				Iterator it=s.iterator();
				
				while(it.hasNext())
				{
					Map.Entry map1=(Map.Entry)it.next(); // to get key and value as seperate value
					
					System.out.println(map1.getKey());
					System.out.println(map1.getValue());
					
					
					
				}

		
		
		

		
		
		Object[] obj= {1,"ABC",2,3};
		for(Object a:obj)
		{
			
			System.out.println(a);
		}
		
		
		
		arrayListToArray();
		
		Set<String> carsetFerrari=new HashSet<String>();
		
		carsetFerrari.add("FerrariVintage");
		carsetFerrari.add("Ferrari90s");
		carsetFerrari.add("Ferrari2000");
		carsetFerrari.add("Ferrari2020");
		
		System.out.println(carsetFerrari);
		
	 // System.out.println(carsetFerrari.toArray());
		
	Object[] a = carsetFerrari.toArray();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		//ArrayList<String> a=new ArrayList<String>(); // a object can only use Arraylist Class 
	
		
		List<String> carlist=new ArrayList<String>(); // list is interface variable which can point to Arraylist, LinkedList, Vector class object
		
		carlist.add("Ferrari");
		
		System.out.println(carlist);
		
		carlist.add("Mercedes");
		
		System.out.println(carlist);
		
		carlist.add("BMW");
		
		System.out.println(carlist);
		
		carlist.add("BMW");
		System.out.println(carlist);
		
		System.out.println(carlist.get(0));
		
		carlist.add(1, "Meserati");
		
		System.out.println(carlist);
		
		System.out.println(carlist.remove(3));
		
		System.out.println(carlist);
		
		//Integer  a=new Integer(1);
		//System.out.println(a.toString());
	}		
		
		
		
		
		
		//questionnnnnn
		
		public static void arrayListToArray() {
			ArrayList <String> al= new ArrayList <String> ();
			al.add("lebanon");
			al.add("madrid");
			
			al.add("washinton");
			System.out.println(al);
		Object[] cities = 	al.toArray();//(new String [al.size()]); //we have to declare the size of the array so that why we do 
	for (Object x:cities) {
		System.out.println(x);}
	}
	public static	void sortArray() {
		int [] a= {2,5,3,7,9};
		int temp;
		ArrayList <Integer>al3= new ArrayList<Integer>();
		for (int i = 0;i<a.length;i++) {
			for (int j=i+1;j<a.length ;j++) {
				if (a[i]>a[j]) {
				temp=a[i]	;
				a[i]=a[j];
				a[j]= temp;
//				a=a+b;
//				b=a-b;
//				a=a-b
				
}
			}
			System.out.println(a[i]);
		}
			
//  ArrayList <String> al2= new ArrayList<String>();
//  al2.add("Manal");
//  al2.add("Anawal");
//  System.out.println(al2);
// Object [] d= al2.toArray();
// for (Object a:d) {
//	 System.out.println(a);
 }
}

