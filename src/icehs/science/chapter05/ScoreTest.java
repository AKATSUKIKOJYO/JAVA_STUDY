package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Sum = 0;
		double average = 0;
		
		
		System.out.print("���� �л�����? : " );
		int StudentNum = scanner.nextInt();
		System.out.println("�л���" + StudentNum);
		
		for (int i = 1; i <= StudentNum; i++) {
			System.out.print(i + "�� ����:");
			int score = scanner.nextInt();
			Sum += score;
		}
		average = (double)Sum/StudentNum;
		System.out.println("==================");
		System.out.println(StudentNum+"���� ����:" + Sum + "��");
		System.out.println(StudentNum+"���� ���:" + average + "��");
		System.out.println("==================");
		
	}

}
