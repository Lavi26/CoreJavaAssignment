package com;

import java.util.Scanner;

class Area1 {
	int length;
	int breadth;
	
	Area1(int a,int b) {
		
		length=a;
		breadth=b;
	}
	
	public int returnArea() {
		
		return length*breadth;
		
	}
}

public class AreaOfRectangle {
	
	public static void main(String args[]) {
		
		Scanner object=new Scanner (System.in);
		int a,b;
		
		System.out.println("Enter the length of rectangle");
		a= object.nextInt();
		object.nextLine();
		
		System.out.println("Enter the breadth of rectangle");
		b= object.nextInt();
		object.nextLine();
		
		Area1 obj = new Area1(a,b);
		System.out.println("Area of Rectangle= " +obj.returnArea());
	}

}
