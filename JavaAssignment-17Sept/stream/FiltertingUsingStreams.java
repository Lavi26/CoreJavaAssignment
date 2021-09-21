package com.stream;

import java.util.ArrayList;
import java.util.List;

class Students {
	int rollno;
	String name;

	public Students(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class FiltertingUsingStreams {
	public static void main(String args[]) {
		List<Students> list = new ArrayList<Students>();
	
		list.add(new Students(1, "john"));
		list.add(new Students(2, "lily"));
		list.add(new Students(3, "alecia"));
		list.add(new Students(3, "tokyo"));
		list.add(new Students(2, "nairobi"));


		list.stream().filter(x -> x.rollno > 3).map(x1 -> x1.rollno).forEach(System.out::println);
	}

}