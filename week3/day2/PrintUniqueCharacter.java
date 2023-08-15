package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String input = "Udhankar";
		char[] name = input.toCharArray();
		Set<Character> duplicates = new LinkedHashSet<Character>();

		for (Character letters : name) {
			duplicates.add(letters);
		}
		System.out.println(duplicates);

	}

}
