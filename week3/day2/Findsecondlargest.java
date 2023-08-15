package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Findsecondlargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> EmptySet = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			EmptySet.add(data[i]);
		}

		List<Integer> List = new ArrayList<Integer>(EmptySet);
		Collections.sort(List);
		int size = List.size();
		System.out.println(List.get(size - 2));
	}

}
