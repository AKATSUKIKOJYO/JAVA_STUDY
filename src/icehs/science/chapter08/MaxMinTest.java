package icehs.science.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] numbers = {12, 53, 24, 10, 38, 64, 39};
		
		int maxNum = numbers[0];
		int minNum = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(maxNum < numbers[i]) {
				maxNum = numbers[i];
			}
			if(minNum > numbers[i]) {
				minNum = numbers[i];
			}
		}
		
		System.out.println("ÃÖ´ñ°ª: " + maxNum);
		System.out.println("ÃÖ¼Ú°ª: " + minNum);
		
	}

}
