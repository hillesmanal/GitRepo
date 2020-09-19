package com.pack.java;

public class American {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Human american =new Human(5,4,"broen","blond");
    /* american.eat();
     american.walk();
     american.play();
     american.eyeColor="black";
     american.hairColor="black";
     */
     System.out.println( american.height);
     System.out.println(american.hairColor);
     System.out.println(american.eyeColor);
     american.eat(3,2000);
     american.eat();
     }

}
