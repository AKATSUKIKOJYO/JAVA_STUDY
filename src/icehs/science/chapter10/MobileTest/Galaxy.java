package icehs.science.chapter10.MobileTest;

public class Galaxy extends Mobile {
	private String osVersion;
	
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public void call(int time) {
		System.out.println("Galaxy: " + time + "분 통화하였습니다.");
	}
	
	public void charge(int time) { 
		System.out.println("Galaxy: " + time + "충전하였습니다.");
	}

}
