package icehs.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television INFINIA = new Television("INFINIA", 1500000);
		Television XCANVAS = new Television("XCANVAS", 1000000, "LCD TV");
		Television CINEMA = new Television("CINENA", 2000000, "3D TV");
		
		INFINIA.printTelevisionInfo();
		XCANVAS.printTelevisionInfo();
		CINEMA.printTelevisionInfo();
		
		int totalPrice = INFINIA.price + XCANVAS.price + CINEMA.price;
		System.out.println("가격의 합:" + totalPrice);
		
		
		

	}

}
