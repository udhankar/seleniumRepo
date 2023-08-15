package week3.day2.Assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] string = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int length = string.length;
		Arrays.sort(string);

		for (int i = length - 1; i >= 0; i--) {
			System.out.println(string[i]);
		}

	}

}
