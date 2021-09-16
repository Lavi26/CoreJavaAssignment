package com.java8.lambdaexp;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithLambdaLoop {

	public static void main(String args[]) {
		List<String> list=new ArrayList<String>();
		
		list.add("john");
		list.add("lily");
		list.add("Tom");
		list.add("Alecia");
		list.forEach((n) -> System.out.println(n));
	}
}