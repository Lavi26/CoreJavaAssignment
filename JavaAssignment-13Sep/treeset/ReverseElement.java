package com.treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseElement {
	public static void main(String[] args) {
		TreeSet<Integer> reverseElementOfTreeSet=new TreeSet<Integer>();
		
		reverseElementOfTreeSet.add(10);
		reverseElementOfTreeSet.add(11);
		reverseElementOfTreeSet.add(12);
		reverseElementOfTreeSet.add(13);
		reverseElementOfTreeSet.add(14);
		
		System.out.println("Before reverse TreeSet are : "+reverseElementOfTreeSet);
		
		//Reverse Element in TreeSet
		Iterator itr=reverseElementOfTreeSet.descendingIterator();
		while(itr.hasNext()) {
			System.out.println("Reverse Element in TreeSet are : "+itr.next());
		}
}
}