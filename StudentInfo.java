package com;


class St{
	
	int samrollno= 3;
	int johnrollno= 7;
	
	long samphno= 9897645534l;
	long johnphno= 7856453632l;
	
	String samaddress="Delhi";
	String johnaddress="jaipur";
	
}

public class StudentInfo {
	
	public static void main(String args[]) {
		
		St sam= new St();
		St john= new St();
		
		
		
		System.out.println("sam rollno is  " +sam.samrollno);
		System.out.println("sam phno is  " +sam.samphno);
		System.out.println("sam address is  " +sam.samaddress);
		
		System.out.println("john rollno is  " +john.johnrollno);
		System.out.println("john phno is  " +john.johnphno);
		System.out.println("john address is  " +john.johnaddress);
		
		
	}
	
	

}