package icehs.science.workshop2;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("계좌를 계산합니다.");
		Account account = new Account("441-0290-1203", 500000, 7.3);
		account.printAccountInfo();
		System.out.println();
		account.deposit(20000);
		System.out.println();
		account.calculateInterst();
		System.out.println();
		account.withdraw(150000);
		System.out.println();
		account.withdraw(500000);

	}

}
