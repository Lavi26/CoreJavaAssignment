package com.treemap;

import java.util.TreeMap;

public class CopyFromOneToAnother {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		
		System.out.println(map);
		
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();
		map1.putAll(map);
		
		System.out.println(map1);
		
		
	}

}