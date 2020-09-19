package com.pack.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

 

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





public class CollectionsDemo1 {
	public static void main(String[] args) {
ArrayList<String> a = new ArrayList<String>();
a.add("manal");
a.add("feryal");
a.add("waleed");

System.out.println(a);

List<String> b = new ArrayList<String>();

b.add("feryal");
b.add("waleed");
System.out.println(b);

System.out.println(a.contains("feryal"));
System.out.println(a.equals(b));

System.out.println(a.isEmpty());	
a.trimToSize();
System.out.println(a);

	HashSet <String>hs = new HashSet <String>();
	hs.add("london");
	hs.add("mosco");
	hs.add("jerusalem");
	System.out.println(hs);
	System.out.println(hs.size());
	Iterator<String> i = hs.iterator() ;
while (i.hasNext()) {
	System.out.println(i.next());
}
/*	i.next();
	i.next();
	
	System.out.println(i.next());
	String d= i.next();
	System.out.println(d);
*/

HashMap <Integer,String> hm= new HashMap <Integer, String>();

hm.put(0,"lemon")	;
hm.put(1,"lime");
hm.put(2, "tomato");
Set shm= hm.entrySet();
Iterator it = shm.iterator();
while(it.hasNext()) {
	Map.Entry mp= (Map.Entry) it.next();
	
	 String d = (String) mp.getValue();
	Object c=mp.getKey();
	//System.out.println(d);
	System.out.println(c);
	System.out.println(d);

}

		
		
		
		
		
		
		
		
		
		
		

	}}


