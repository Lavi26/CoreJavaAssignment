package com.treeset;

import java.util.TreeSet;

public class CloneTreeSet {
	public static void main(String[] args) {
		TreeSet<String> addColor= new TreeSet<String>();
		
		//adding element using add method
		
		addColor.add("Red");
		addColor.add("Black");
		addColor.add("Blue");
		addColor.add("Green");
		
		System.out.println("TreeSet are "+addColor);
		
		// clone treeSet list to Another treeSet
		
		TreeSet<String> NewTreeSet=(TreeSet<String>)addColor.clone();
		System.out.println("Cloning TreeSet are "+NewTreeSet);
		
}
}