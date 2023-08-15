package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Missingnumber {

	public static void main(String[] args) {
		int[] Numbers = { 1, 2, 3, 3, 5, 6, 7, 8, 6, 9, 2, 10 };

		Set<Integer> Set = new LinkedHashSet<Integer>();

		for (int i = 0; i < Numbers.length; i++) {
			Set.add(Numbers[i]);
		}

		Integer[] Array = Set.toArray(new Integer[Set.size()]);

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] != i + 1) {
				System.out.println(i);
				break;
			}
			i++;

		}
	}

}
