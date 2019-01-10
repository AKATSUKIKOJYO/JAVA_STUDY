package icehs.science.chapter05;

public class ConditionElseIfEx {

	public static void main(String[] args) {
		
		int age = 15;
		
		if ( age >= 19 ) {
			System.out.println("성인입니다.");
			System.out.println("입장하세요");
		} else if ( age >= 13 ) {
			System.out.println("청소년입니다.");
			System.out.println("청소년 관람불가 영화는 볼 수 없습니다.");
		} else {
			System.out.println("어린이입니다.");
			System.out.println("15세 이상 관람 가능 영화를 볼 수 없습니다.");
		}

	}

}
