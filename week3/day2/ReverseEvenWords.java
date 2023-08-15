package week3.day2.Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] chars = test.split(" ");

		for (int i = 0; i < chars.length; i++) {

			if (i % 2 != 0) {
				char[] charArray = chars[i].toCharArray();

				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
			}

			else {
				System.out.print(chars[i] + " ");
			}
		}
	}
}
