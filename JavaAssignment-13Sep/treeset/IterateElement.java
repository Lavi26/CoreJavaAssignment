package com.treeset;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class IterateElement {
	public static void main(String[] args) {
		NavigableSet<Integer> iterateTreeList= new TreeSet<Integer>();
		
		//Adding element using add method
		iterateTreeList.add(10);
		iterateTreeList.add(20);
		iterateTreeList.add(30);
		iterateTreeList.add(40);
		
		
		//Iteration method
		Iterator itr=iterateTreeList.iterator();
		
		while(itr.hasNext()) {
			System.out.println("After Iterating  : "+itr.next());
	}
}
}