package ch13;

public class BitOperattionTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2); // 바뀌지 않은 변수 
		System.out.println(num1 <<= 2); // = 변수의 값을 바꾸려면 대입 연산자(=)를 작
		System.out.println(num1);
		System.out.println(num1 >> 1);
		
	}

}
