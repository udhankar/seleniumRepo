package org.Assignment4;

public class Students {
	public void getStudentInfo(int ID) {

		System.out.println("Student ID = " + ID);
	}

	public void getStudentInfo(int ID, String name) {

		System.out.println("Student ID = " + ID + " Student name = " + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email = " + email + " Student name = " + phoneNumber);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(8055);
	    obj.getStudentInfo(8055, "udhankar");
	    obj.getStudentInfo("udhankar8055@gmail.com", 9380380338l);

	}

}
