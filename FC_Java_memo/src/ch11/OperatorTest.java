package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int myNum = 10;
		int yourNum = 20;
		
//		myNum = myNum + yourNum;
		myNum += yourNum;
//		System.out.println(myNum);
		
		
		int gameScore = 150;
		
//		int lastScore = ++gameScore;
		// gameScore += 1;  ===  gameScore = gameScore + 1; => 151,151
		// => 1을 추가한 다음에 스테이트가 끝난
		
		int lastScore = gameScore++;
		// gameScore += 1;  ===  gameScore = gameScore + 1; => 150,151
		// => 스테이트가 끝난 다음에 1을 추가
		
		// --gameScore 도 동일
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
	}

}
