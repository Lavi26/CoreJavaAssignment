package com.hashset;

import java.util.*;

public class CloneHashSetToAnotherHashSet {
	
	  public static void main(String[] args) {
		  
	         // Create a empty hash set
	     HashSet<String> hashset = new HashSet<String>();
	     
	   // use add() method to add values in the hash set
	      	  hashset.add("Red");
	      	  hashset.add("Green");
	          hashset.add("Black");
	          hashset.add("White");
	         
	    System.out.println("Original Hash Set: " + hashset);
	    HashSet <String> newHashSet = new HashSet <String> ();
	    newHashSet = (HashSet)hashset.clone();
	          System.out.println("Cloned Hash Set: " + newHashSet);         
	   }
	}
