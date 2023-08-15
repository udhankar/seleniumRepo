package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] Array = text.split(" ");

		for (int i = 0; i < Array.length; i++) {

		}
		Set<String> emptyset = new LinkedHashSet<String>();

		for (int i = 0; i < Array.length; i++) {
			emptyset.add(Array[i]);
		}
		System.out.println(emptyset);

	}
}