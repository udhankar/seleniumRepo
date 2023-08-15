package week3.day2.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		String string = "madam";
		String rev = "";
		int length = string.length();

		for (int i = (length - 1); i >= 0; i--) {

			rev = rev + string.charAt(i);
		}
		if (string.equals(rev)) {
			System.out.println("its a palindrom");
		}

		else {
			System.out.println("its not a palindrom");
		}
	}

}
