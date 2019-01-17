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
		System.out.println("���ͷ� :" + this.earningRate + "%");
		System.out.println("������ �߻��Ͽ����ϴ�.");
		System.out.println();
		System.out.println();
		
	}
	
	public void openAccount() {
		super.openAccount();
		System.out.print("�ݵ� ���� ��ȣ :");
		System.out.println(getNumber());
		System.out.println("������ :" + getName());
		System.out.println("�ܾ� :" + getBalance() + "��");
		
	}

}
