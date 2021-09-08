package com;


import java.util.Scanner;

class Area {
	
	float length,breadth,area;
	
	void setDim(float length,float breadth) {
		
		
		this.length = length;
		this.breadth = breadth;
		
		area = this.length * this.breadth;
	}
	
	float getArea() {
		
		return area;
	}

}

public class AreaByGetMethod {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner (System.in);
		
		Area areaofrectangle= new Area();
		
	    float length, breadth;
		
		System.out.println("Enter the length of rectangle: ");
		length=sc.nextFloat();
		
		System.out.println("Enter the breadth of rectangle: ");
		breadth=sc.nextFloat();
		
		areaofrectangle.setDim(length,breadth);
		
		System.out.println("Area of Rectangle = "+ areaofrectangle.getArea());
		
		
	}

}
