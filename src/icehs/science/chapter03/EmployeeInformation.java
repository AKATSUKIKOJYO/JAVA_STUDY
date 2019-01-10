package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String year = "2002";
		
		System.out.println("이름: " + name);
		System.out.println("입사년도: " + year);
		
		int Workyear = Integer.parseInt(year);
		
		int Thisyear = 2019;
		System.out.println("근무년도: " + (Thisyear - Workyear));

	}

}
