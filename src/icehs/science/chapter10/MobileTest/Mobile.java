package icehs.science.chapter10.MobileTest;

public class Mobile {
	private String production;
	
	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void call(int time) {
		System.out.println(this.production + ":" + time + "�� ��ȭ�Ͽ����ϴ�.");
	}
	
	public void charge(int time) { 
		System.out.println(this.production + ":" + time + "�����Ͽ����ϴ�.");
	}
}
