package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class HashSetToArrayList {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();

		// Adding element using add method

		hashSet.add(11);
		hashSet.add(12);
		hashSet.add(13);

		System.out.println("HashSet are : " + hashSet);
		
		// Creating ArrayList
		List<Integer> list = new ArrayList<Integer>(hashSet);

		System.out.println("ArrayList are : " + list);

	}
}