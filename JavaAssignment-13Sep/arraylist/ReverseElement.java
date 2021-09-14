package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElement {
	public static void main(String[] args) {
	List<Integer> reverseElement=new ArrayList<Integer>();
	
	reverseElement.add(10);
	reverseElement.add(11);
	reverseElement.add(12);
	reverseElement.add(13);
	reverseElement.add(14);
	
	System.out.println("Before reverse Arraylist are : "+reverseElement);
	
	//Reverse Element in ArrayList
	Collections.sort(reverseElement,Collections.reverseOrder());
	
	System.out.println("Reverse Element in Arraylist are : "+reverseElement);
	
}
}
