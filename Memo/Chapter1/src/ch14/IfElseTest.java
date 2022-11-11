package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		if (age >= 8) {
			
			System.out.println("학교에 다닙니다.");
			
		} else {
			
			System.out.println("학교에 다니지 않습니다.");			
			
		}
		
	}

}
