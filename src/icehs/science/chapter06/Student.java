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
		System.out.println("이름:" + studentName);
		System.out.println("학번:" + studentId);
		System.out.println("국어 성적:" + Korean);
		System.out.println("영어 성적:" + Englist);
		System.out.println("수학 성적:" + Math);
	}
	
	public void changeStudentId(String newId) {
		studentId = newId;
	}
	
}
