package icehs.science.chapter09;

public class AcoountTest {

	public static void main(String[] args) {
		FundAccount fund1 = new FundAccount("111-2222", "È«±æµ¿", 5000000, 4.7);
		FundAccount fund2 = new FundAccount("666-7777", "È«±æ¼ø", 1000000, 2.9);
		
		fund1.openAccount();
		fund1.earnMoney();
		
		fund2.openAccount();
		fund2.earnMoney();

	}
	
		
		
		
}
