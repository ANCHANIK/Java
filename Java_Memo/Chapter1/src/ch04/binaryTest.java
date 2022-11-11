package ch04;

public class binaryTest {

	public static void main(String[] args) {

		int num = 10;
		int bNum = 0B1010; // 0B : 식별자, 2진수 10
		int oNum = 012; // 8진수, 앞에 0을 붙임으로써 8진수로 표현됨
		int xNum = 0XA; // 16진수, 앞에 0X를 붙임으로써 16진수 표현
		
		// 1010 => 2^3*1 + 2^2*0 + 2^1*1 + 2^0*0
		// 1bite = 2^개 
		
		System.out.println(num); //10
		System.out.println(bNum); //10
		System.out.println(oNum); //10
		System.out.println(xNum); //10
		
	}

}
