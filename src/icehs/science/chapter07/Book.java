package icehs.science.chapter07;

public class Book {
	private String title;
	private int price;
	String author;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	Book(String author) {
		this.author = author;
	}
	
	Book(String title, String author) {
		this(author);
		this.title = title;
	}
	
	Book(String title, String author, int price) {
		this(title,author);
		this.price = price;
	}
	
	void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
	}

}
