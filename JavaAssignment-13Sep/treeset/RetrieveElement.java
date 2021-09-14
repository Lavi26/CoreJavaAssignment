package com.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RetrieveElement {
public static void main(String args[]) {
		
		TreeSet<Integer> retrieveFirstAndLastElement=new TreeSet<Integer>();
		
		//Element are added using add method
		retrieveFirstAndLastElement.add(10);
		retrieveFirstAndLastElement.add(20);
		retrieveFirstAndLastElement.add(30);
		retrieveFirstAndLastElement.add(40);
		
		System.out.println("TreeSet are : "+retrieveFirstAndLastElement);
		
		//Retrieving the first element 
		int FirstElement=retrieveFirstAndLastElement.pollFirst();
		
		//Retrieving the second element 
		int LastElement=retrieveFirstAndLastElement.pollLast();
		
		System.out.println("First Element is  "+FirstElement+"\nLastElement is "+LastElement);
}
}