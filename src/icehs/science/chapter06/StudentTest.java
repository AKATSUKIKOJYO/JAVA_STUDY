package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentName = "홍길동";
		student.studentId = "S001";
		student.Korean = 94;
		student.Englist = 80;
		student.Math = 89;
		
		student.printStudentInfo();
		
		int average = student.calculateAverage();
		System.out.println("평균:" + average);
		
		System.out.println("*학번을 변경합니다.");
		student.changeStudentId("STU001");
		
		student.printStudentInfo();

	}

}
