package org.Assignment;

public class Automation extends Multiplelangauge implements Language {

	public void java() {
		// TODO Auto-generated method stub

	}

	public void selenium() {
	}

	public void python() {
		System.out.println("python");
	}

	public void ruby() {
		System.out.println("ruby");
	}

	public static void main(String[] args) {

		Automation obj = new Automation();
		obj.java();
		obj.ruby();
		obj.python();

	}

}
