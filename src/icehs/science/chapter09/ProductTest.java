package icehs.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product Iaundry = new Product("통돌이", 450000, 8);
		Television TV = new Television("씨네마 TV", 3500000, 10, "화면 크기 151cm");
		
		Iaundry.printProductInfo();
		System.out.println("----------------------------------------");
		TV.printProductInfo();
		System.out.println("비고 :" + TV.getDescription());
		
		System.out.println("[공지] 할인률을 모두 15%로 변경합니다.");
		
		Iaundry.setDiscountRate(15);
		TV.setDiscountRate(15);
		
		System.out.println( Iaundry.getName() + "판매가 :" + Iaundry.calculateDiscountPrice());
		System.out.println( TV.getName() + "판매가 :" + TV.calculateDiscountPrice());

	}

}
