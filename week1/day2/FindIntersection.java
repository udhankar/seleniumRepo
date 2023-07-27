package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array = { 3, 2, 11, 4, 6, 7 };
		int[] numbers = { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i <= array.length-1; i++) {
			for (int j = 0; j <= numbers.length-1; j++) {
				if (array[i] == numbers[j]) {
					System.out.println(array[i]);
				}
			}
		}

	}

}
