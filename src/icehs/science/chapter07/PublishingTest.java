package icehs.science.chapter07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication pub = new Publication();
		
		System.out.println("==== 출판물 정보를 세팅합니다. ====");
		
		pub.setTitle("만화 삼국지");
		pub.setPrice(5000);
		pub.setPage(300);
		
		System.out.print("출판물 정보:");
		System.out.print(pub.getTitle() );
		System.out.print("(" + pub.getprice() + "원, ");
		System.out.println(pub.getpage() + "page)");
	}
	
	

}
