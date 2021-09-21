package com.stream;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethodUsingJStream {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(-4);
		list.add(43);
		list.add(2);

		int sum = list.stream().reduce(0, (x1, x2) -> x1 + x2);
		System.out.println(sum);

	}

}