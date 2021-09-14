package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsKeyValueEmpty {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		
		//before 
		System.out.println(map.isEmpty());
		
		//removing all the elements
		map.clear();
		
		//after
		System.out.println(map.isEmpty());
	}

}