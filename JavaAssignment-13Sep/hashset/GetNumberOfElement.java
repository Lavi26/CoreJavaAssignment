package com.hashset;


import java.util.HashSet;

public class GetNumberOfElement {
		public static void main(String[] args) {
			HashSet<Integer> getNumberOfElement= new HashSet<Integer>();
			
			//Adding element using add method
			getNumberOfElement.add(11);
			getNumberOfElement.add(12);
			getNumberOfElement.add(13);
			getNumberOfElement.add(14);

			System.out.println("HashSet are : "+getNumberOfElement);
			
			//find number of element
			int numberOfElement=getNumberOfElement.size();
			
			System.out.println("Number of element in Hashset are : "+numberOfElement);
}
}