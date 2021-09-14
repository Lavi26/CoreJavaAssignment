package com.treemap;


import java.util.TreeMap;

public class GetAllKeys {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		
		System.out.println(map.keySet());
	}

}