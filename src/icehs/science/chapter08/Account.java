package icehs.science.chapter08;

public class Account {
	private String name;
	private int balance;
	private double interestRate;
	
	public Account(String name, int balance, double interestRate) {
		this.name = name;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public int calculateInterest() {
		return (int)(this.balance * this.interestRate /100);
	}
	
	
}
