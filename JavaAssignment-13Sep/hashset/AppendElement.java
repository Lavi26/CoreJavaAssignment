package com.hashset;

import java.util.HashSet;

public class AppendElement {
	public static void main(String[] args) {
		HashSet<Integer> appendSpecifiedElement=new HashSet<Integer>();
		
		appendSpecifiedElement.add(11);
		appendSpecifiedElement.add(12);
		appendSpecifiedElement.add(13);
		appendSpecifiedElement.add(14);
		
		System.out.println("HashSet before append "+appendSpecifiedElement);
		
		//append element at last position
		appendSpecifiedElement.add(15);
		
		System.out.println("HashSet after append "+appendSpecifiedElement);
		
	}
}