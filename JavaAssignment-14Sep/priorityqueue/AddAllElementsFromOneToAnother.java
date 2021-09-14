package com.priorityqueue;

import java.util.PriorityQueue;

public class AddAllElementsFromOneToAnother {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Blue");
		queue.add("White");
		System.out.println("Elements of 1st Queue :"+queue);
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.addAll(queue);
		System.out.println("Elements of 2nd Queue : "+queue1);
		
		
	}
}