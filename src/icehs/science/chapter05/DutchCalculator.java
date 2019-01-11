package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumMoney = 0;
		
		System.out.println("모임이 몇 차로 진행되나요?");
		int meetingNo = scanner.nextInt();
		
		System.out.println("======================");
		System.out.println("각 차수에서 쓴 비용을 입력하세요.");
		for(int i =1; i <= meetingNo; i++) {
			System.out.print(i+"차 비용:");
			int money = scanner.nextInt();
			sumMoney += money;
		}
		System.out.println("총 비용은 " + sumMoney + "원입니다.");
		System.out.println("======================");
		System.out.print("모임의 인원수를 입력하세요.");
		int memberNo = scanner.nextInt();
		System.out.println("======================");
		int dutchMoney = sumMoney / memberNo;
		for(int i = 1; i <= memberNo; i++) {
			if(i != memberNo) {
				System.out.println(i + ":" + dutchMoney);
				sumMoney -= dutchMoney;
			} else {
				System.out.println(i + ":" + sumMoney);
			}
		}
	}

}
