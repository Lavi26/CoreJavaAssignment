package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;  

class Students1 {
	int rollno;
	String name;

	public Students1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class ConvertListIntoSet {
	public static void main(String args[]) {
		List<Students1> list = new ArrayList<Students1>();
		list.add(new Students1(1, "john"));
		list.add(new Students1(2, "lily"));
		list.add(new Students1(3, "alecia"));
		list.add(new Students1(3, "tokyo"));
		list.add(new Students1(2, "nairobi"));

		
		Set<Integer> set = list.stream()
				            .filter(x -> x.rollno > 1)
				            .map(x -> x.rollno)
				            .collect(Collectors.toSet());
		System.out.println(set);
	}

}	
	