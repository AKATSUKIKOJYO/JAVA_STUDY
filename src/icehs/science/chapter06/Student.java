package icehs.science.chapter06;

public class Student {
	String studentName;
	String studentId;
	int Korean;
	int Englist;
	int Math;
	
	public int calculateAverage() {
		int average = (Korean + Englist + Math) / 3;
		return average;
	}
	
	public void printStudentInfo() {
		System.out.println("�̸�:" + studentName);
		System.out.println("�й�:" + studentId);
		System.out.println("���� ����:" + Korean);
		System.out.println("���� ����:" + Englist);
		System.out.println("���� ����:" + Math);
	}
	
	public void changeStudentId(String newId) {
		studentId = newId;
	}
	
}
