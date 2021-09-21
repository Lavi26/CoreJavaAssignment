package com.stream;

import java.util.ArrayList;
import java.util.List;

public class FilteringCollectionWithoutUsingStreams {
	public static void main(String args[]) {
		List<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(5);
		b.add(77);
		b.add(802);
		b.add(30);

		for (Integer names : b) {
			if (names > 50) {
				System.out.println(names);
			}
		}

	}

}