package icehs.science.chapter10;

public class Taxi extends Car {
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}
	
	public void go(int distance) {
		System.out.println("�ýø� Ÿ��" + distance + "km �̵��մϴ�.");
		System.out.println("����: " + super.getOilSize());
	}
	
}