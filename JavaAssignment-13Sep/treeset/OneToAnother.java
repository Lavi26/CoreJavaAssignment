package com.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class OneToAnother {
	public static void main(String[] args) {
		TreeSet<String> treeSet1=new TreeSet<String>();
		
		treeSet1.add("Red");
		treeSet1.add("Green");
		treeSet1.add("Blue");
		
		//Creating Another TreeSet
		TreeSet<String> treeSet2=new TreeSet<String>();
		
		treeSet2.add("Yellow");
		treeSet2.add("Pink");
		
		treeSet2.addAll(treeSet1);
		System.out.println("TreeSet "+treeSet1);
		System.out.println("TreeSet To Another TreeSet "+treeSet2);
	}
}