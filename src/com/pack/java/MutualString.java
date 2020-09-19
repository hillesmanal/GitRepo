package com.pack.java;

public class MutualString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
     String a="manal";
     String b="manal";
     String str1= new String("manal");
     String str2=new String("manal");
System.out.println(a==b);
System.out.println(a.equals(b));
System.out.println(a==str1);
System.out.println(a.equals(str1));
System.out.println(str1==str2);
System.out.println(str1.equals(str2));

StringBuilder sb1= new StringBuilder("hello") ;//  is not Thread safe/not syncronized // faster than string buffer 
sb1.charAt(2);
sb1.deleteCharAt(4);
System.out.println(sb1);

StringBuffer sb=new StringBuffer("manal");// is thread safe and syncronized // slower than string builder 
sb.reverse();
sb.append("hilles");

System.out.println(sb);

	}

}
