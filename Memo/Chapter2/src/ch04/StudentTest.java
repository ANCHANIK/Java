package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		// 각각의 인스턴스를 사용할 수 있는 이유 => 각각 다른 메모리를 사용하고 있기 때문
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}