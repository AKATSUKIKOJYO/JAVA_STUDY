package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String year = "2002";
		
		System.out.println("�̸�: " + name);
		System.out.println("�Ի�⵵: " + year);
		
		int Workyear = Integer.parseInt(year);
		
		int Thisyear = 2019;
		System.out.println("�ٹ��⵵: " + (Thisyear - Workyear));

	}

}
