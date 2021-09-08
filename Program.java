package com;

public class Program {
	
	public static void main(String args[]) {
		
		//variable declaration
		int number1= 5;                    
		int number2= 6;
		
		 //Addition of Two integer
		int temp= number1+number2;                                  //temp variable
		System.out.println("Addition of two number is  " + temp);   //print
		
		
		 //Substraction of two integer
		int temp1=number2-number1;  
		System.out.println("Substraction of two number is  " + temp1);
		
		
		 //Multiplication of floating no.
		float number3= 2.5f;
		float number4= 3.5f;
		
		float temp2= number3 * number4;  
		System.out.println("Multiplication of two number is  " + temp2);
		
		
		 //Area of Rectangle of floating no.
		float length=(float) 4.2;
		float breadth=(float) 2.4;
		
		float temp3=length*breadth;     
		System.out.println("Area of rectangle of two number is  " + temp3);
		
		
		  //Area of Square...
		float side=4.2f;
		
		float temp4= side*side;      
		System.out.println("Area of Square is  " + temp4);
		
		
		  //Area of Triangle..
		float base=3.4f;
		float height=4.6f;
		
		float temp5= (base*height)/2;
		System.out.println("Area of Triangle is  " + temp5);
		
		
		  //Simple Interest
		float principal=(float) 3.1;
		float rate=(float) 2.1;
		float timeperiod=(float) 2.50;
		
		float temp6=(principal*rate*timeperiod)/100;   
		System.out.println("Simple Interest is  " + temp6);
		
		
		
	}

}
