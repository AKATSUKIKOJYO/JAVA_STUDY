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
		System.out.println(this.production + ":" + time + "분 통화하였습니다.");
	}
	
	public void charge(int time) { 
		System.out.println(this.production + ":" + time + "충전하였습니다.");
	}
}
