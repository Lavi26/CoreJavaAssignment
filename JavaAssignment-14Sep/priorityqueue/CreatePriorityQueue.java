package com.priorityqueue;

import java.util.PriorityQueue;

public class CreatePriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Blue");
		queue.add("White");
		
		System.out.println("Elements of Queue are : "+queue);
	}

}