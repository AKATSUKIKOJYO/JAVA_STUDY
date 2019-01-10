package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String king = "¼¼Á¾´ë¿Õ";
		String value = "10000";
		int year = 2017;
		
		System.out.println(king + ":" + value);
		System.out.println(year);
		System.out.println(value + year);
		
		int parseValue = Integer.parseInt(value);
		System.out.println(parseValue + year);
		

	}

}
