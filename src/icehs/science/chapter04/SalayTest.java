package icehs.science.chapter04;

public class SalayTest {

	public static void main(String[] args) {
		int salay = 1000000;
		int annualincome = salay * 12;
		int tax = annualincome*10/100;
		int bonuce = (salay * 20/100)*4;
		int bonucetax = bonuce * 55/1000;
				
		System.out.println("����: " + annualincome); 
		System.out.println("���� ����: " + (annualincome-tax));
		System.out.println("���ʽ�: " + bonuce);
		System.out.println("���� ���ʽ�: " + (bonuce-bonucetax));
		System.out.println("���޾�: " + (annualincome-tax+bonuce-bonucetax));
		
		
	}

}
