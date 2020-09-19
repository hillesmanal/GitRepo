package com.pack.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class arrayANdSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set <String>set = new HashSet<String>();
  set.add("BMW");
  set.add("audi");
  set.add("honda");
 //System.out.println(set);
 for( String s:set) {
	 //System.out.println(s);
 }
 Set <String> lSet=new LinkedHashSet<String>();
 lSet.add("BMW");
 lSet.add("audi");
 lSet.add("honda");
// System.out.println("linkedHasSet");
//System.out.println(lSet);
 for (String h:lSet) {
	// System.out.println(h);
 }
 Set<String>tSet= new TreeSet<String>();
 tSet.add("BMW");
 tSet.add("audi");
 tSet.add("honda");
// System.out.println("treeSet");
 //System.out.println(tSet);
 for(String t:tSet) {
	// System.out.println(t);
 }
 Map <Integer,String>map= new HashMap <Integer,String>();
 
map.put(3,"BmMW");
map.put(2,"audi");
map.put(5, "honda");
String value1= map.get(2);System.out.println(value1);
String value2= map.get(3);System.out.println(value2);

map.put(1,"BMW");
map.put(2, "honda");
for(Entry<Integer,String> entry : map.entrySet()) {
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}

//System;
//for(Map.Entry<Integer,String> entry:map.entrySet()) {
	//int key= entry.getKey();
	//String value = entry.out.println(map).getValue();
	//System.out.println("Key:"+key+",value:"+value);
	//System.out.println(key);
	//System.out.println(value);
;
	}


}
