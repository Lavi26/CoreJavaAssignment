package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateElement {
	public static void main(String[] args) {
		LinkedList<Integer> IterateElement= new LinkedList<Integer>();
		
		//Adding element using add method
		IterateElement.add(10);
		IterateElement.add(20);
		IterateElement.add(30);
		IterateElement.add(40);
		
		//Iteration method
		Iterator itr=IterateElement.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Iterating List is : "+itr.next());
	}
}

}