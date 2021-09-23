package com.hibernateassignment;

import java.util.ArrayList;
import java.util.List;

import com.studentservices.StudentServices;

public class ManageStudent {

	public static void main(String args[]) {
		StudentServices studentServices = new StudentServices();

		/* Add few employee records in database */
		Integer studentDetails1 = studentServices.addStudent("Tokyo", "Salesforce", "Delhi");// asssinged values from
																								// here
		Integer studentDetails2 = studentServices.addStudent("lily", "Java", "Gurgaon");// asssinged values from here

		List<Integer> listinfo = new ArrayList<Integer>();

		listinfo.add(studentDetails1);
		listinfo.add(studentDetails2);
		if (listinfo.size() != 0) {
			System.out.println(
					"******************************************Inserted********************************************");
		} else {
			System.out.println("############################Not Inserted########################################");
		}

		/* List student records in databse */
		try {
			studentServices.ListOfAllStudents();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* Update student records in database */
		try {
			studentServices.updateStudentDetails(6, "Python");
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* delete student records in database by id */
		try {
			studentServices.deleteStudentById(12, "Python");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}