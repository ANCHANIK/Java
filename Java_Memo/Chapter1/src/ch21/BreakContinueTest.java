package ch21;

import java.util.Scanner;

public class BreakContinueTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		// break
		for ( num = 1; ; num++ ) {
			
			sum += num;
			if (sum >= 100) break;
			
			System.out.println(sum);
		}
		
		System.out.println(sum);
		System.out.println(num + "까지 더했을 때 100 이상이다.");
		
		System.out.println("=====================================");
		
		// continue
		// 예제) 3의 배수를 출력하라 -> 3의 배수가 아닌 숫자는 출력 X
		for ( num = 3; num <= 100; num++) {
			
			if ( num % 3 != 0 ) continue;
			
			System.out.println(num);
			
		}
		
	}

}
