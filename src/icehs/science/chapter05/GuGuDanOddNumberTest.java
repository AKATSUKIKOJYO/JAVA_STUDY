package icehs.science.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		int dan = 2;
		while(dan <=5) {
			int i = 1;
			while(i <=9) {
				System.out.println(dan + "X" + i + "=" + dan*i);
				i++;
			}
			dan++;
		}
	}

}
