package com.stream;

import java.util.stream.Stream;

public class IteratingWithStream {
	public static void main(String args[]) {
		Stream.iterate(2,x -> x+10)
		.limit(3)
		.forEach(System.out::println);
	}

}