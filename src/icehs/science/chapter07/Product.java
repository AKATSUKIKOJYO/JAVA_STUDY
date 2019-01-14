package icehs.science.chapter07;

public class Product {
	String name;
	int price;
	int discount;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public void printProductInfo() {
		System.out.println("===="+name+"====");
		System.out.println("정가:" + price);
		if(discount<=0) {
			System.out.println("할인률: 할인하지 않음");
		} else {
			System.out.println("할인률:" + discount);
		}
	}
	
	

}
