package com.constructors;




public class Perimeter {
	
	Perimeter() {                     //zero argument
		
		int length=3;
		int breadth=5;
		
		int perimeterofrectangle = (length + breadth)*2;
		
		System.out.println("Perimeter of rectangle is  " +perimeterofrectangle);
	}
	
	
	Perimeter(int side) {                   //parameterized
		
		int perimeterofsquare= 4*side;
		
		System.out.println("Perimeter of square is  " +perimeterofsquare);
	}

	
	Perimeter(int base, int side1, int side2) {                     // overloading
		
		int perimeteroftriangle= base+side1+side2;
		
		System.out.println("Perimeter of Triangle is  " +perimeteroftriangle);
	}
	
	
	public static void main(String args[]) {
		
		Perimeter perimeterofrectangle= new Perimeter();
		Perimeter perimeterofsquare= new Perimeter(4);
		Perimeter perimeteroftriangle= new Perimeter(4,5,6);
	}
}
