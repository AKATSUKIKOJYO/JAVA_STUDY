package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int SumAll = 0;
		int SumOdd = 0;
		int SumEven = 0;
		
		for (int inx = 1; inx  <= 1000; inx++) {
			if (inx % 2 ==0) {
				SumEven += inx;
			} else {
				SumOdd += inx;
			}
		}
		
		SumAll = SumOdd + SumEven;
		
		System.out.println("1���� 1000������ ��:" + SumAll);
		System.out.println("1���� 1000���� ¦������ ��:" + SumEven);
		System.out.println("1���� 1000���� Ȧ������ ��:" + SumOdd);
	}

}
