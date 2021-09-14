package com.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class CompareTwoTreeSet {

	  public static void main(String[] args) {
	        TreeSet<String> treeset1 = new TreeSet<String>();
	     // use add() method to add values in the tree set
	        treeset1.add("Red");
	        treeset1.add("Green");
	      
	          System.out.println("First Tree set: "+treeset1);

	          TreeSet<String> treeset2 = new TreeSet<String>();
	          treeset2.add("Red");
	          treeset2.add("Green");
	   
	          System.out.println("Second Tree set: "+treeset2);
	          
	          //compare tree set
	          boolean value
	            = treeset1.equals(treeset2);
	  
	        // print the value
	         System.out.println("Are both set equal: "+ value);
	          }      
	     }
