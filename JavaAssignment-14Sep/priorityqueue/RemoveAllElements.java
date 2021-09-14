package com.priorityqueue;

import java.util.PriorityQueue;

public class RemoveAllElements {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Blue");
		queue.add("White");
		System.out.println("Elements of 1st Queue : "+queue);
		
		queue.removeAll(queue);
		System.out.println("Elements in Queue are : "+queue);
	}

}