package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
	public static void main(String[] args) {
		List<String> updateElement=new ArrayList<String>();
		
		//Element are added using add method
		
		updateElement.add("john");
		updateElement.add("lily");
		updateElement.add("tulip");
		updateElement.add("jasmine");
		
		System.out.println("Before Update Arraylist are : "+updateElement);
		
		updateElement.set(1,"lily disuza");
		
		//updating index no. 1 
		
		System.out.println("After update Arraylist are : "+updateElement);
	}
}