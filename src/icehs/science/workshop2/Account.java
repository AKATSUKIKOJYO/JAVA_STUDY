package icehs.science.workshop2;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(int money) {
		System.out.println(">>" + money + "���� �Ա��մϴ�.");
		this.balance += money;
		this.printAccountInfo();
	}
	
	public void withdraw(int money) {
		System.out.println(">>" + money + "���� ����մϴ�.");
		if(this.balance < money) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		} else {
			this.balance -= money;
		}
		this.printAccountInfo();
	}
	
	public void calculateInterst() {
		int price = (int)(this.balance * this.interestRate / 100);
		this.balance += price;
		System.out.println("���ڸ� �����մϴ�.");
		System.out.println("���� : " + price + "��");
		System.out.println("���¹�ȣ : " + this.account + ", �ܾ� : " + this.balance + ", ������ : " + this.interestRate + "%");
	}
	
	public void printAccountInfo() {
		System.out.println("���¹�ȣ : " + this.account + ", �ܾ� : " + this.balance + ", ������ : " + this.interestRate + "%");
	}
	
}
