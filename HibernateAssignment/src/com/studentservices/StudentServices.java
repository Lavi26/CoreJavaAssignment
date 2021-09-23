package com.studentservices;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernateutil.HibernateUtil;
import com.hibernateassignment.Student;

public class StudentServices {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	// Create
	public Integer addStudent(String name, String course, String address) {
		Transaction transaction = null;
		Integer studentDetails = null;
		try {
			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			transaction = sessionObj.beginTransaction();
			
			Student student = new Student(name, course, address);
			studentDetails = (Integer) sessionObj.save(student);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

		return studentDetails;
	}

	// Get
	public void ListOfAllStudents() {
		Transaction transaction = null;
		try {
			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			transaction = sessionObj.beginTransaction();

			// Logic
			List students = sessionObj.createQuery("From Student").list();
			Iterator iterator = students.iterator();
			while (iterator.hasNext()) {
				Student student1 = (Student) iterator.next();
				System.out.println("Student Roll number " + student1.getRollNo());
				System.out.println("Student Name " + student1.getName());
				System.out.println("Student Course " + student1.getCourse());
				System.out.println("Student Course  Address" + student1.getAddress() + "\n");
			}
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

	// Update
	public void updateStudentDetails(Integer StudentId, String course) {

		Transaction transaction = null;
		try {
			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			transaction = sessionObj.beginTransaction();
			// update logic
			Student student = (Student) sessionObj.get(Student.class, StudentId);
			student.setCourse(course);
			sessionObj.update(student);// hibernate will form update query automatically
			System.out.println("Update sucessfully");
			transaction.commit();// Explicitly call the commit ensure that auto commit should be false
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

	// Delete
	public void deleteStudentById(Integer StudentId, String course) {
		Transaction transaction = null;
		try {
			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			transaction = sessionObj.beginTransaction();
			Student student = (Student) sessionObj.get(Student.class, StudentId);
			student.setCourse(course);
			sessionObj.delete(student);    // hibernate will form delete query automatically
			System.out.println("deleted sucessfully..." + student.getRollNo());
			;
			transaction.commit(); // explicitly call the commit ensure that auto commit should be false
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}
}