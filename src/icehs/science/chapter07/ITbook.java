package icehs.science.chapter07;

public class ITbook {
	private String title;
	private int price;
	private double discountRate;
	
	public ITbook(String title, int price, double discountRate) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printITbookInfo() {
		double totalprice = price*(1-discountRate/100);
		System.out.println("제목:" + title + ", 정가:" + price + ",할인률:" + discountRate + ", 할인가:" + (int)totalprice);
	}

}
