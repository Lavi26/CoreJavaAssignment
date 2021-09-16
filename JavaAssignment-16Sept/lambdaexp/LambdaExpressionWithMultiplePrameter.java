package com.java8.lambdaexp;

interface Addable{
	 //with parameters
	int add(int a,int b,int c);
}
public class LambdaExpressionWithMultiplePrameter {

	public static void main(String args[]) {
		
		Addable d1=(a,b,c)->(a+b+c);
		System.out.println(d1.add(20, 30, 40));
	}
}