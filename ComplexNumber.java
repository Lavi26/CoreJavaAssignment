package com;

class Complex{
	
	private final double real;
	private final double imaginary;
	
	public Complex(double real, double imaginary) {
		
		this.real=real;
		this.imaginary=imaginary;
	}
	
	//Addition
	
	public Complex sum(Complex other) {
		double r= this.real+ other.real;
		double i= this.imaginary + other.imaginary;
		return new Complex(r,i);
	}
	
	//Difference
	
	public Complex diff(Complex other) {
		
		double r = this.real+ other.real;
		double i = this.imaginary+ other.imaginary;
		return new Complex(r,i);
	}
	
	//Product
	
	public Complex prod(Complex other) {
		
		double r = this.real+ other.real;
		double i = this.imaginary+ other.imaginary;
		return new Complex(r,i);
		
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
	
}

public class ComplexNumber {
	
	public static void main(String args[]) {
		
		//first complex number
		Complex c1 = new Complex(2,4);
		
		//second complex number
		Complex c2 = new Complex(3,5);
		
		Complex sum = c1.sum(c2);
		Complex diff = c1.diff(c2);
		Complex prod = c1.prod(c2);
		
		System.out.println("first complex number " + c1);
		System.out.println("second complex number " + c2);
		
		System.out.println("sum of two complex number " + sum);
		System.out.println("Difference of two complex number " + diff);
		System.out.println("Product of two complex number " + prod);
		
	
	}

}
