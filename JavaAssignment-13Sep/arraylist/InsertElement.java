package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class InsertElement {
	public static void main(String[] args) {
		List<Integer>insertElement=new ArrayList<Integer>();
		
		//Element are added using add method
		insertElement.add(10);
		insertElement.add(30);
		insertElement.add(40);
		insertElement.add(50);
		
		System.out.println("ArrayList Before inserting : "+insertElement);
		
		insertElement.add(1,20);
		
		//Add Element at first position
		System.out.println("ArrayList After inserting : "+insertElement);
	}
}