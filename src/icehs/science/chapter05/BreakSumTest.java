package icehs.science.chapter05;

public class BreakSumTest {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int inx = 1; inx <= 10; inx++) {
			sum += inx;
			
			if (sum > 30) {
				break;
			}
		}
		System.out.println("합계 결과 :" + sum);

	}

}
