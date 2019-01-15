package icehs.science.chapter07;

public class PublishingTest2 {

	public static void main(String[] args) {
		Publication.printHeader();
		
		Publication samgookji = new Publication();
		Publication piStory = new Publication();
		
		samgookji.setTitle("만화 삼국지");
		samgookji.setPage(300);
		samgookji.setPrice(5000);
		samgookji.printPublicationInfo();
		
		piStory.setTitle("파이 이야기");
		piStory.setPrice(8400);
		piStory.setPage(280);
		piStory.printPublicationInfo();

	}

}
