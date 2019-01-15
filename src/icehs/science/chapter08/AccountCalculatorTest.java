package icehs.science.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		Account [] acc = { 
				new Account("111-2222-5551", 10000, 4.5), 
				new Account("111-2222-5552", 20000, 4.5), 
				new Account("111-2222-5553", 30000, 4.5), 
				new Account("111-2222-5554", 40000, 4.5), 
				new Account("111-2222-5555", 50000, 4.5)
		};
		
		for(int i = 0; i < acc.length; i++) {
			System.out.println("계좌번호: " + acc[i].getName() + " / 잔액: " + acc[i].getBalance() + 
					" / 이율: " + acc[i].getInterestRate() + "%");
		}
		
		System.out.println("이율을 변경합니다.");
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
		}
		
		
		for(int i = 0; i < acc.length; i++) {
			System.out.println("계좌번호: " + acc[i].getName() + " / 이율: " + acc[i].getInterestRate() + "%" + 
					" / 잔액: " + (acc[i].getBalance() + acc[i].calculateInterest()));
		}
		
		
		
		}

}
