package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lotto = 0.0000001235;
		long population = 6973738433L;
		int intLotto = (int)lotto;
		int intPopulation = (int)population;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " +lotto);
		System.out.println("�ζǿ� ��÷�� Ȯ�� int��ȯ: " +intLotto);
		System.out.println("�� ������ �α� �� : " +population);
		System.out.println("�� ������ �α� �� int��ȯ : " +intPopulation);
		
	}

}
