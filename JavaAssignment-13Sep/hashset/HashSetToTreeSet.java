package com.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		
		hashSet.add(11);
		hashSet.add(12);
		hashSet.add(13);
		
		//Creating  TreeSet
		Set<Integer> treeSet=new TreeSet<Integer>(hashSet);
		
		for(int element:treeSet) {
			System.out.println(element);
		}
	}
}