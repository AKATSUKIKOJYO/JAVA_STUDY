package icehs.science.workshop1;

//���� 3.
//�� ���� �ֻ����� ������ ��,
//���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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