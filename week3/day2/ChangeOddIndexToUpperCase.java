package week3.day2.Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 != 0) {
				char odd = Character.toUpperCase(charArray[i]);
				String Uppercase = String.valueOf(odd);

				System.out.print(Uppercase);

			} else
				System.out.print(Character.toLowerCase(charArray[i]));

		}

	}

}
