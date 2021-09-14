package com.linkedlist;

import java.util.LinkedList;

public class InsertElement {
	public static void main(String[] args) {
		LinkedList<Integer> insertElementAtSpecifiedIndex= new LinkedList<Integer>();
		
		//Adding element using add method
		insertElementAtSpecifiedIndex.add(10);
		insertElementAtSpecifiedIndex.add(20);
		insertElementAtSpecifiedIndex.add(30);
		insertElementAtSpecifiedIndex.add(40);
		
		System.out.println("LinkedList before insert : "+insertElementAtSpecifiedIndex);
		
		// insert element at specified index
		insertElementAtSpecifiedIndex.add(4, 50);
		System.out.println("LinkedList after append : "+insertElementAtSpecifiedIndex);
	}
}