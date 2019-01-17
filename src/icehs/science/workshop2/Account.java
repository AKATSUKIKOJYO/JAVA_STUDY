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
		System.out.println(">>" + money + "원을 입금합니다.");
		this.balance += money;
		this.printAccountInfo();
	}
	
	public void withdraw(int money) {
		System.out.println(">>" + money + "원을 출금합니다.");
		if(this.balance < money) {
			System.out.println("[에러] 잔액이 부족합니다.");
		} else {
			this.balance -= money;
		}
		this.printAccountInfo();
	}
	
	public void calculateInterst() {
		int price = (int)(this.balance * this.interestRate / 100);
		this.balance += price;
		System.out.println("이자를 지급합니다.");
		System.out.println("이자 : " + price + "원");
		System.out.println("계좌번호 : " + this.account + ", 잔액 : " + this.balance + ", 이자율 : " + this.interestRate + "%");
	}
	
	public void printAccountInfo() {
		System.out.println("계좌번호 : " + this.account + ", 잔액 : " + this.balance + ", 이자율 : " + this.interestRate + "%");
	}
	
}
