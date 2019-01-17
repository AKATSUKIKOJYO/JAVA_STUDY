package icehs.science.chapter10.MobileTest;

public class IPhone extends Mobile {
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void call(int time) {
		System.out.println("IPhone: " + time + "분 통화하였습니다.");
	}
	
	public void charge(int time) { 
		System.out.println("IPhone: " + time + "충전하였습니다.");
	}

}
