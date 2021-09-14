package com.hashset;

import java.util.HashSet;

public class IsEmptyHashSet {
	public static void main(String[] args) {
		HashSet<Integer> addElement= new HashSet<Integer>();
		
		//Adding element using add method
		addElement.add(11);
		addElement.add(12);
		addElement.add(13);
		addElement.add(14);

		System.out.println("HashSet are : "+addElement);
		
		//Empty HashSet
		boolean result =addElement.isEmpty();
		if(result) {
			System.out.println("HashSet is empty");
       }
		else {
			System.out.println("HashSet is not empty");
		}
}
}