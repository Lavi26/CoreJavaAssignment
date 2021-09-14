package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
	List<Integer> sortArrayList=new ArrayList<Integer>();
	
	sortArrayList.add(10);
	sortArrayList.add(11);
	sortArrayList.add(12);
	sortArrayList.add(13);
	sortArrayList.add(14);
	
	System.out.println("Before sorting list are : "+sortArrayList);
	
	//Sort Arraylist by ascending order
	Collections.sort(sortArrayList);
	
	System.out.println("sorting in ascending order, Arraylist are : "+sortArrayList);
	
	//Sort Arraylist by descending order
	Collections.sort(sortArrayList,Collections.reverseOrder());
		
	System.out.println("sorting in descending order, Arraylist are : "+sortArrayList);
}
}