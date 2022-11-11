package ch16;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4:
				day = 30;
				break;
			case 6:
				day = 30;
				break;
			case 9:
				day = 30;
				break;
			case 11:
				day = 30;
				break;
			default:
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		
		System.out.println(month + "월은 " + day + "일입니다.");
		
		
		
		
		// java 14버전 이후부터 가능
		switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> 
				day = 31;
			case 2 -> 
				day = 28;
			case 4, 6, 9, 11 ->
				day = 30;
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
			}
		}

		System.out.println(month + "월은 " + day + "일입니다.");
		
		
		// switch yield 반환값
		int days = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 ->  {
				System.out.println("이번달은 31일 까지 입니다.");				
				yield 31;
			}
			case 2 -> 
				28;
			case 4, 6, 9, 11 ->
				30;
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield -1;
			}
		};
	
		System.out.println(month + "월은 " + days + "일입니다.");
		
		
	}

}
