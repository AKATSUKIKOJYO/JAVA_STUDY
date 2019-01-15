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
		System.out.println("SQL Plus ������ ���η��� �����մϴ�.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printITbookInfo();
		
		System.out.println();
		System.out.println("Java 2.0 ������ �����մϴ�.");
		java.setPrice(33000);
		java.printITbookInfo();
		
		System.out.println();
		System.out.println("JSP Servlet ����� ���η��� �����մϴ�.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printITbookInfo();
		
	}

}
