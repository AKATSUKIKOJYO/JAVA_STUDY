package icehs.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product Iaundry = new Product("�뵹��", 450000, 8);
		Television TV = new Television("���׸� TV", 3500000, 10, "ȭ�� ũ�� 151cm");
		
		Iaundry.printProductInfo();
		System.out.println("----------------------------------------");
		TV.printProductInfo();
		System.out.println("��� :" + TV.getDescription());
		
		System.out.println("[����] ���η��� ��� 15%�� �����մϴ�.");
		
		Iaundry.setDiscountRate(15);
		TV.setDiscountRate(15);
		
		System.out.println( Iaundry.getName() + "�ǸŰ� :" + Iaundry.calculateDiscountPrice());
		System.out.println( TV.getName() + "�ǸŰ� :" + TV.calculateDiscountPrice());

	}

}
