package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		String mathScore = "96";
		int englistScore = 82;
		
		int parseMathScore = Integer.parseInt( mathScore);
		
		System.out.println( "�̸� : " +name);
		System.out.println( "���� ���� : " +mathScore);
		System.out.println( "���� ���� : " +englistScore);
		System.out.println( "-----------" );
		System.out.println( mathScore + englistScore );
		System.out.println( parseMathScore + englistScore );
		

	}

}
