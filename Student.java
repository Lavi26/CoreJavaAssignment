package com;



class Stud {
	
	int showData() {

		int rollno= 2;
		return rollno;
		
		}
		
		String showData1() {

		String name= "John";
		return name;
		
		}
}	
		
public class Student {
	
public static void main(String args[]) {
		
		//create object for int
		
		Stud detail1= new Stud();
		int rollno=detail1.showData();
		System.out.println("roll no. = " + rollno);
		
		//create object for string
		
		Stud detail2= new Stud();
		String name=detail2.showData1();
		System.out.println("name = " + name);
		
}

}


