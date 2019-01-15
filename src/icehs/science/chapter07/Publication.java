package icehs.science.chapter07;

public class Publication {
	private String title;
	private int price;
	private int page;
	

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
	
	public int getpage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}

	public static void printHeader() {
		System.out.println("====== 도서 정보 조회 ======");
		
	}

	public void printPublicationInfo() {
		System.out.println(title + "(" + price + "원, " + page + "page)");
		
	}
	
	

}
