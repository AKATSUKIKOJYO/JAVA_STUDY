package icehs.science.chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		
		int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		int sum = 0;
		
		System.out.print("배열의 각 요소:");
		
		for(int inx = 0; inx < numbers.length; inx++) {
			System.out.print(numbers[inx] + " " );
			sum += numbers[inx];
		}
		
		System.out.println("\n총합: " + sum);

	}

}
