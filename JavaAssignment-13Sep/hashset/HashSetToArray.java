package com.hashset;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		
		// adding element using add method
		hashSet.add(11);
		hashSet.add(12);
		hashSet.add(13);
		
		//Creating  Array
		Integer array[]=new Integer[hashSet.size()];
		hashSet.toArray(array);
		
		for(int element:array) {
			System.out.println(element);
		}
	}
}