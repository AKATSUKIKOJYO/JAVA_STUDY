package icehs.science.chapter08;

public class OddAdditionTest {

	public static void main(String[] args) {
		int [] numbers = {10, 21, 33, 42, 51, 64, 79, 80};
		
		int sum = 0;
		
		for(int inx = 0; inx < numbers.length; inx++) {
			if(numbers[1] % 2 ==1) {
				sum += numbers[1];
			}
		}
		
		System.out.println("홀수의 합계는 " + sum +"입니다.");

	}

}
