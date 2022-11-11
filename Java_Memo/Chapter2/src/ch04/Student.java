package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println( studentID + "학번의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}
	
	// studentName을 가져가는 함수
	public String getStudentName() {
		return studentName;
	}
	
	// 반환값이 없으면 void 작성
	public void setStudentName (String name) {
		studentName = name;
	}
}
