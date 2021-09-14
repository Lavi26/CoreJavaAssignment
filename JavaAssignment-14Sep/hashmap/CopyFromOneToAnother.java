package com.hashmap;


import java.util.HashMap;
import java.util.Map;

public class CopyFromOneToAnother {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		
		System.out.println(map);
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.putAll(map);
		System.out.println(map1);
	}

}