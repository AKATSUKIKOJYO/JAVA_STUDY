package icehs.science.workshop1;

//문제 3.
//두 개의 주사위를 던졌을 때,
//눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
public class Workshop03 {
 
	public static void main( String[] args ) {
		for(int inx = 1; inx <= 5; inx++) {
			for(int jnx = 5; jnx >= 1; jnx--) {
				int total = inx + jnx;
				if(total > 6 || total < 6) {
					continue;
				}
				System.out.println(inx + "+" + jnx + "=" + total);
			}
		}
     
     
 	}
}