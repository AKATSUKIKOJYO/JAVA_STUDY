package icehs.science.chapter09;

public class FundAccount extends Account {
	private double earningRate;
	
	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	public void earnMoney() {
		System.out.println("수익률 :" + this.earningRate + "%");
		System.out.println("수익이 발생하였습니다.");
		System.out.println();
		System.out.println();
		
	}
	
	public void openAccount() {
		super.openAccount();
		System.out.print("펀드 계좌 번호 :");
		System.out.println(getNumber());
		System.out.println("예금주 :" + getName());
		System.out.println("잔액 :" + getBalance() + "원");
		
	}

}
