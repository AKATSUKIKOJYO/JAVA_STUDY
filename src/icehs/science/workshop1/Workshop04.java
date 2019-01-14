package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int caferatte = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int beigle = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamcheese = getUserInput();
        
        System.out.println( "========= �ݾ� =========" );
        int ame = americano * 2000;
        System.out.println( " �Ƹ޸�ī�� : " + ame + "��");
        int caf = caferatte * 3000;
        System.out.println( " �Ƹ޸�ī�� : " + caf + "��");
        int bei = beigle * 1500;
        System.out.println( " �Ƹ޸�ī�� : " + bei + "��");
        int cre = creamcheese * 500;
        System.out.println( " �Ƹ޸�ī�� : " + cre + "��");
        
        System.out.println( "=========================" );
        int totalprice = ame + caf + bei + cre;
        System.out.println("�� ���� �ݾ�: " + totalprice + "��");
        if(totalprice >=12000 && totalprice < 30000) {
        	int point = totalprice / 100;
        System.out.println("����Ʈ ����: " + point + "��");	
        } else if (totalprice >= 30000) {
        	int point = totalprice / 50;
        System.out.println("����Ʈ ����: " + point + "��");
        } else {
        	System.out.println("����Ʈ ����: 0��");
        }
        
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
