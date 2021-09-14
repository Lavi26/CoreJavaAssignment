package com.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;

public class IterateFromSpecifiedElement {
	public static void main(String[] args) {
		LinkedList<Integer> iterateFromSpecifiedElement= new LinkedList<Integer>();
		
		//Adding element using add method
		iterateFromSpecifiedElement.add(10);
		iterateFromSpecifiedElement.add(20);
		iterateFromSpecifiedElement.add(30);
		iterateFromSpecifiedElement.add(40);
		
		//Iteration method from specified index
		Iterator itr=iterateFromSpecifiedElement.listIterator(1);
		
		while(itr.hasNext()) {
			System.out.println("After Iterating List are : "+itr.next());
	}
}
}