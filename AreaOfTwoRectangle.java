package com;

class Rectangle {
	
	int Area(int length,int breadth) {
		return(length*breadth);
	}
}

public class AreaOfTwoRectangle {
	public static void main(String args[]) {
		
		Rectangle rectangle1=new Rectangle();
		System.out.println("Area of Rectangle1= " + rectangle1.Area(4, 5));
		
		Rectangle rectangle2=new Rectangle();
		System.out.println("Area of Rectangle2= " + rectangle2.Area(5, 8));
	}

}
