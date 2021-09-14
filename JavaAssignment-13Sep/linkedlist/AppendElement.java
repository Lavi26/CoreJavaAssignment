package com.linkedlist;

import java.util.LinkedList;

public class AppendElement {
	public static void main(String[] args) {
		LinkedList<Integer> appendElement= new LinkedList<Integer>();
		
		//Adding element using add method
		appendElement.add(10);
		appendElement.add(20);
		appendElement.add(30);
		appendElement.add(40);
		
		System.out.println("LinkedList before append : "+appendElement);
		
		appendElement.addLast(50);
		System.out.println("LinkedList after append : "+appendElement);
	}
}