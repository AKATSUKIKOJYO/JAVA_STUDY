package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num1 = 456;
		int num2 = num1 / 100;
		int num3 = num1 - (num2 * 100);
		int num4 = num3 / 10;
		int num5 = num3 - (num4 * 10);
		
		System.out.println("����: " + num1);
		System.out.println("���� �ڸ� ��: " + num2);
		System.out.println("���� �ڸ� ��: " + num4);
		System.out.println("���� �ڸ� ��: " + num5);
		

	}

}
