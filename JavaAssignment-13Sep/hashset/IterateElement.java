package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateElement {
	public static void main(String[] args) {
		HashSet<Integer> iterateElement= new HashSet<Integer>();
		
		//Adding element using add method
		iterateElement.add(11);
		iterateElement.add(12);
		iterateElement.add(13);
		iterateElement.add(14);
		
		//Iteration method
		Iterator itr=iterateElement.iterator();
		
		while(itr.hasNext()) {
			System.out.println("After Iterating HashSet are : "+itr.next());
	}
}
}