package com.linkedlist;

import java.util.LinkedList;

public class FirstLastInsertion {
	public static void main(String[] args) {
		LinkedList<Integer> FirstLastInsertion= new LinkedList<Integer>();
		
		//Adding element using add method
		FirstLastInsertion.add(10);
		FirstLastInsertion.add(20);
		FirstLastInsertion.add(30);
		FirstLastInsertion.add(40);
		
		System.out.println("LinkedList before insertion : "+FirstLastInsertion);
		
		//insert element at first position
		FirstLastInsertion.addFirst(05);
		
		//insert element at last position
		FirstLastInsertion.addLast(50);
		
		System.out.println("LinkedList after insertion  : "+FirstLastInsertion);
	}
}