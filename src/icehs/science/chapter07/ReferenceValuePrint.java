package icehs.science.chapter07;

public class ReferenceValuePrint {

	public static void main(String[] args) {
		Publication publication1 = new Publication();
		Publication publication2 = new Publication();
		
		System.out.println("publication1의 객체 참조 주소값");
		System.out.println(publication1);
		
		System.out.println("publication2의 객체 참조 주소값");
		System.out.println(publication2);
		int i = 10;
		System.out.println("int 변수 저장값:" + i);

	}

}
