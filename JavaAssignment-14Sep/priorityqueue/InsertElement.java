package com.priorityqueue;

import java.util.PriorityQueue;

public class InsertElement {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Blue");
		queue.add("White");
	
		System.out.println("Elements are : "+queue);
		
		//Adding a element in queue
		queue.offer("Grey");
		queue.add("Pink");
		
		System.out.println(queue);
		
	}
}