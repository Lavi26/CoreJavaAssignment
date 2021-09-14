package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement {
	public static void main(String args[]) {
		
		List<Integer> retrieveElement=new ArrayList<Integer>();
		
		//Element are added using add method
		retrieveElement.add(10);
		retrieveElement.add(20);
		retrieveElement.add(30);
		retrieveElement.add(40);
		
		System.out.println("Array list "+retrieveElement);
		
		//Retrieving the element of specified index from array list
		int result=retrieveElement.get(2);
		
		System.out.println("Element you are looking for is "+result);
	}
}