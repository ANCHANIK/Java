package ch20;

import java.util.Scanner;

public class NestedLoofTest {

	public static void main(String[] args) {

		// 구구단
		
		Scanner scanner = new Scanner(System.in);
		
		int dan = scanner.nextInt();
		int count = 1;
		
		//for
//		for ( ; dan <= 9; dan++) {
//			
//			for ( count = 1; count <= 9; count++) {
//				
//				System.out.println(dan + "X" + count + "=" + (dan*count));
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		
		//while
		//dan = scanner.nextInt();
		count = 1;
		while ( dan <= 9 ) {
			
			count = 1; 
				while ( count <= 9 ) {
				
				System.out.println(dan + "X" + count + "=" + (dan*count));
				
				count++;
			}
				
			dan++;
			
			System.out.println();
			
		}
		
	}

}
