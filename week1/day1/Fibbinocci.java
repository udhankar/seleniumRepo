package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstnum= 0;
		int secondnum= 1;
		int sum= 0;
		
		
		for(int i=0; i<=11; i++) {
		sum=(firstnum+secondnum);
		firstnum=secondnum;
		secondnum=sum;
		System.out.println(firstnum);
		}

	}

}
