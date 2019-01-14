package icehs.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	public String getName() {
		return name;
	}
	public int calculateTotalPrice(int count) {
		return count * price;
	}
	
	public int calculateTotalPrice(int count, int discount) {
		return count * price * (100 - discount) / 100;
	}
	public void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	public void changeChocolateInfo(String newName, String newType, int newPrice) {
		name = newName;
		type = newType;
		price = newPrice;
		printChocolateInfo();
	}
	public void printChocolateInfo() {
		System.out.println("이름:" + name + ", 종류:" + type + ", 가격:" + price);
	}

}
