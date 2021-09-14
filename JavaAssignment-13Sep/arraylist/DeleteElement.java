package com.arraylist;


import java.util.ArrayList;
import java.util.List;

//Remove third element from the ArrayList
public class DeleteElement {
	
		public static void main(String[] args) {
			List<Integer>removeElement=new ArrayList<Integer>();
			
			//Element are added using add method
			
			removeElement.add(10);
			removeElement.add(30);
			removeElement.add(40);
			removeElement.add(50);
			
			System.out.println("ArrayList Before Removing: "+removeElement);
			
			removeElement.remove(2);
			
			////Remove third element from the ArrayList
			System.out.println("ArrayList After Removing : "+removeElement);
		}
	}