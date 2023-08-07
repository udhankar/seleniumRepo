package org.Student;

import org.Department.Department;

public class Student  extends Department {
	
	public void studentName() {
		System.out.println("Student Name");
	}
	
	public void studentDept() {
		System.out.println("Department");
	}
	
	public void studentID() {
		System.out.println("Student ID");
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDept();
		obj.studentID();
		

	}

}
