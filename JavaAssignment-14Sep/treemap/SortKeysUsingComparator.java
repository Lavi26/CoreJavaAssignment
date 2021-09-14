package com.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortKeysUsingComparator {
	public static void main(String args[]) {
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(new classa());
		map.put(9,12);
		map.put(3,9);
		map.put(7,98);
		map.put(4,45);
		
		
		System.out.println(map);		
	}
}

class classa implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}