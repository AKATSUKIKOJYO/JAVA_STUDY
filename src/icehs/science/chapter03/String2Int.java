package icehs.science.chapter03;

public class String2Int {

	public static void main(String[] args) {
		String firstNum = "25";
		String second = "20";
		
		int intFirstNum = Integer.parseInt(firstNum);
		int intSecondNum = Integer.parseInt(second);
		
		System.out.println(firstNum + second);
		System.out.println(intFirstNum + intSecondNum);
		System.out.println(firstNum + second + intFirstNum + intSecondNum);
		System.out.println(intFirstNum + intSecondNum + firstNum + second);
		System.out.println(firstNum + intFirstNum);
		

	}

}
