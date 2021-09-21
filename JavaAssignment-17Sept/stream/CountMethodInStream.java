package com.stream;


import java.util.ArrayList;
import java.util.List;

public class CountMethodInStream {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(-4);
		list.add(43);
		list.add(2);

		int count = (int) list.stream()
				.count();
		System.out.println(count);

	}

}