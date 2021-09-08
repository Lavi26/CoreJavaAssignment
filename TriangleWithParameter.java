package com;

class TriangleResult {
	
	float getAreaOfTriangle(float side1,float side2,float side3) {
		
		float semiperimeter= (side1+side2+side3)/2;
		
		float areaofTriangle= (float) Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
		return areaofTriangle;
	}
	
	
	float getPerimeterOfTriangle(float side1,float side2,float side3) {
		
		float perimeteroftriangle= (side1+side2+side3);
		return perimeteroftriangle;
	}

}

public class TriangleWithParameter {
public static void main(String args[]) {
		
		TriangleResult area = new TriangleResult();
		float areaofTriangle= area.getAreaOfTriangle(3,4,5);
		System.out.println("Area of Triangle= "+ areaofTriangle);
		
		TriangleResult perimeter = new TriangleResult();
		float perimeteroftriangle= perimeter.getPerimeterOfTriangle(3,4,5);
		System.out.println("Perimeter of Triangle= "+ perimeteroftriangle);

        }
	
}