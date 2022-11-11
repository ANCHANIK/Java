package ch19;

import java.util.Scanner;

public class ForTeset {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		int input = scanner.nextInt();
		
		
		// for
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i ++, count++) {
			sum += count;
		}
		
		System.out.println("for value : " + sum);
		
		
		// while
		int num = 1;
		int total = 0;
		
		while ( num <= 10 ) {
			total += num;
			num++;
		}
		
		System.out.println("while value : " + total);
	}

}
