package com.priorityqueue;


import java.util.PriorityQueue;

public class CountNumberOfElements {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Pink");
		queue.add("White");
		System.out.println("Elements of 1st Queue :"+queue);
		
		System.out.println(queue.size());
		
		
	}
}