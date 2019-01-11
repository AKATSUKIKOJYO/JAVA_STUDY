package icehs.science.chapter05;

public class GuGuDanTest {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j ==9) {
					System.out.print(i + "X" + j + "=" + i*j);
				}else { 
					System.out.print(i + "X" + j + "=" + i*j + "\t");
				}
			}
			System.out.println();
		}

	}

}
