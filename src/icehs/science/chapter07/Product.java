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
		System.out.println("����:" + price);
		if(discount<=0) {
			System.out.println("���η�: �������� ����");
		} else {
			System.out.println("���η�:" + discount);
		}
	}
	
	

}
