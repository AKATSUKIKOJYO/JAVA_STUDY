package icehs.science.chapter07;

public class ITbookTest {

	public static void main(String[] args) {
		ITbook sql = new ITbook("SQL Plus", 50000, 5.5);
		ITbook java = new ITbook("Java 2.0", 28000, 3.2);
		ITbook jsp = new ITbook("JSP Servlet", 37000, 6.9);
		
		sql.printITbookInfo();
		java.printITbookInfo();
		jsp.printITbookInfo();
		
		System.out.println();
		System.out.println("SQL Plus 정가와 할인률을 변경합니다.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printITbookInfo();
		
		System.out.println();
		System.out.println("Java 2.0 정가를 변경합니다.");
		java.setPrice(33000);
		java.printITbookInfo();
		
		System.out.println();
		System.out.println("JSP Servlet 제목과 할인률을 변경합니다.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printITbookInfo();
		
	}

}
