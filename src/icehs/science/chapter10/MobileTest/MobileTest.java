package icehs.science.chapter10.MobileTest;

public class MobileTest {
	public static void main(String[] args) {
	
		Mobile[] mobiles = {
			new Galaxy(),
			new IPhone()
		
		};
		mobiles[0].setProduction("Galaxy");
		mobiles[0].setProduction("IPhone");
		((Galaxy)(mobiles[0])).setOsVersion("안드로이드 오레오");
		((IPhone)(mobiles[1])).setColor("흰색");
		
		System.out.println(mobiles[0].getProduction() + " : " + ((Galaxy)(mobiles[0])).getOsVersion());
		mobiles[0].call(5);
		mobiles[0].charge(30);
		System.out.println(mobiles[0].getProduction() + " : " + ((IPhone)(mobiles[1])).getColor());
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}
	
}
