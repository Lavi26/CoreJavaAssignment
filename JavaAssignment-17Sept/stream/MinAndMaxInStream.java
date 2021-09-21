package com.stream;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxInStream {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(-4);
		list.add(43);
		list.add(2);

		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);
		
		int min = list.stream().min(Integer::compare).get();
		System.out.println(min);

	}


}