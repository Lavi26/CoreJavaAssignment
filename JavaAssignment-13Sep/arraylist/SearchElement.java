package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
	public static void main(String[] args) {
		List<Integer> searcheElement=new ArrayList<Integer>();
		
		searcheElement.add(11);
		searcheElement.add(22);
		searcheElement.add(33);
		searcheElement.add(44);
		searcheElement.add(55);
		
		System.out.println("List are : "+searcheElement);
		
		//searching element
		boolean result=searcheElement.contains(22);
		if(result) {
			System.out.println("Element is present in the Arraylist");
		}
		else {
			System.out.println("Element is not present in the Arraylist");
		}
	}
}