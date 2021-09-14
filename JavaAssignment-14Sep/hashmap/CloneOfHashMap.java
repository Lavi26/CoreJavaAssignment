package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CloneOfHashMap {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		System.out.println(map);
		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1 = (Map<Integer, String>) ((HashMap) map).clone();
		
		System.out.println(map1);

	}

}