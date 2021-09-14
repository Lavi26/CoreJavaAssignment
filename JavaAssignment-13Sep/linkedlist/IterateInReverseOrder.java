package com.linkedlist;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateInReverseOrder {
	public static void main(String[] args) {
		LinkedList<Integer> iterateInReverseOrder= new LinkedList<Integer>();
		
		//Adding element using add method
		iterateInReverseOrder.add(10);
		iterateInReverseOrder.add(20);
		iterateInReverseOrder.add(30);
		iterateInReverseOrder.add(40);
		
		//Iterate in Reverse Order 
		
		Collections.sort(iterateInReverseOrder,Collections.reverseOrder());
		Iterator itr=iterateInReverseOrder.iterator();
		
		while(itr.hasNext()) {
			System.out.println("After Iterating List are : "+itr.next());
	}
}
}