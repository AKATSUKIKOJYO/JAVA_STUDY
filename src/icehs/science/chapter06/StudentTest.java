package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentName = "ȫ�浿";
		student.studentId = "S001";
		student.Korean = 94;
		student.Englist = 80;
		student.Math = 89;
		
		student.printStudentInfo();
		
		int average = student.calculateAverage();
		System.out.println("���:" + average);
		
		System.out.println("*�й��� �����մϴ�.");
		student.changeStudentId("STU001");
		
		student.printStudentInfo();

	}

}
