package com;

class Triangle {
	
	float getAreaOfTriangle() {
	
	float side1=3;
	float side2=4;
	float side3=5;
	
	float semiperimeter= (side1+side2+side3)/2;
	
	float areaofTriangle= (float) Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
	return areaofTriangle;
	
	}
	
	float getPerimeterOfTriangle() {
		
		float side1=3;
		float side2=4;
		float side3=5;
		
		float perimeteroftriangle= (side1+side2+side3);
		return perimeteroftriangle;
	}
}


public class TriangleWithoutParameter {
	
	public static void main(String args[]) {
		
		Triangle area = new Triangle();
		float areaofTriangle= area.getAreaOfTriangle();
		System.out.println("Area of Triangle= "+ areaofTriangle);
		
		Triangle perimeter = new Triangle();
		float perimeteroftriangle= perimeter.getPerimeterOfTriangle();
		System.out.println("Perimeter of Triangle= "+ perimeteroftriangle);
		
	}

}
