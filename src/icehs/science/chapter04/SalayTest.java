package icehs.science.chapter04;

public class SalayTest {

	public static void main(String[] args) {
		int salay = 1000000;
		int annualincome = salay * 12;
		int tax = annualincome*10/100;
		int bonuce = (salay * 20/100)*4;
		int bonucetax = bonuce * 55/1000;
				
		System.out.println("연봉: " + annualincome); 
		System.out.println("세후 연봉: " + (annualincome-tax));
		System.out.println("보너스: " + bonuce);
		System.out.println("세후 보너스: " + (bonuce-bonucetax));
		System.out.println("지급액: " + (annualincome-tax+bonuce-bonucetax));
		
		
	}

}
