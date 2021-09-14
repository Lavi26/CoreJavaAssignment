package com.treeset;


import java.util.TreeSet;
import java.util.Iterator;

public class NumberOfElement {
	  public static void main(String[] args) {
	     TreeSet<String> addElement= new TreeSet<String>();
	   // use add() method to add values in the tree set
	     addElement.add("Red");
	     addElement.add("Green");
	     addElement.add("Pink");
	     
	     System.out.println("Original tree set: " +addElement);
	    System.out.println("Number of the element in tree set: " +addElement.size());
	   }
}