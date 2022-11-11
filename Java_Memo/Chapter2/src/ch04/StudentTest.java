package ch04;

public class StudentTest {

	public static void main(String[] args) {

		// A 학생 - 인스턴스
		Student studentLee = new Student(); // student 인스턴스 하나를 생성해라
		// 클래스를 기반으로 여러개의 인스턴스가 생성 가능
		// studentLee : 참조변수
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("안찬익");
		studentLee.address = "서울시 노원";
		
		studentLee.showStudentInfo();
		
		// B 학생 - 인스턴스
		Student studentAn = new Student();
		studentAn.studentID = 2012211156;
		studentAn.studentName = "홍길";
		studentAn.address = "경기도 의정부시";
		
		studentAn.showStudentInfo();
	}

}
