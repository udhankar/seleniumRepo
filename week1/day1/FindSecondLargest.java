package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int length = Array.getLength(data);
		Arrays.sort(data);
		System.out.println(+data[length - 2]);

	}

}
