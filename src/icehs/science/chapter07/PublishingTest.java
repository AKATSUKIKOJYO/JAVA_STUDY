package icehs.science.chapter07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication pub = new Publication();
		
		System.out.println("==== ���ǹ� ������ �����մϴ�. ====");
		
		pub.setTitle("��ȭ �ﱹ��");
		pub.setPrice(5000);
		pub.setPage(300);
		
		System.out.print("���ǹ� ����:");
		System.out.print(pub.getTitle() );
		System.out.print("(" + pub.getprice() + "��, ");
		System.out.println(pub.getpage() + "page)");
	}
	
	

}
