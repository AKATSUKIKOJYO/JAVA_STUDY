package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Sum = 0;
		double average = 0;
		
		
		System.out.print("반의 학생수는? : " );
		int StudentNum = scanner.nextInt();
		System.out.println("학생수" + StudentNum);
		
		for (int i = 1; i <= StudentNum; i++) {
			System.out.print(i + "번 점수:");
			int score = scanner.nextInt();
			Sum += score;
		}
		average = (double)Sum/StudentNum;
		System.out.println("==================");
		System.out.println(StudentNum+"명의 총점:" + Sum + "점");
		System.out.println(StudentNum+"명의 평균:" + average + "점");
		System.out.println("==================");
		
	}

}
