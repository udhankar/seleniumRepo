package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String string = "PayPal India";
		char[] charArray = string.toCharArray();

		Set<Character> charset = new LinkedHashSet<Character>();
		Set<Character> dupcharset = new LinkedHashSet<Character>();

		for (Character a : charArray) {

			if (!charset.add(a)) {
				dupcharset.add(a);
			}
		}

		for (Character character1 : charset) {

			if (character1 != ' ') {
				System.out.print(character1);
			}
		}
	}

}
