package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 5.
// A대학의 학기말이 되었다. 각과목별로 성적을 입력 받아 장학금을 받을 학생을 선별하려고 한다.
// 장학금을 받을 수 있는 조건은 아래와 같다.
//   1) 평점이 3.7 이상   2) 각 과목별 성적이 2.5 이상 (한 과목이라도 2.5 미만인 과목이 있다면, 과락으로 장학금 탈락)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science 성적을 입력하세요 : " );
        double com = getUserInput();
        System.out.print( "Java Programming 성적을 입력하세요 : " );
        double java = getUserInput();
        System.out.print( "공학수학 성적을 입력하세요 : " );
        double math = getUserInput();
        System.out.print( "오페라의 이해 성적을 입력하세요 : " );
        double opera = getUserInput();
        System.out.print( "배드민턴 성적을 입력하세요 : " );
        double badminton = getUserInput();
        System.out.println( "==============================" );
        double average = (com + java + math + opera + badminton) / 5;
        System.out.println( "평점은 " + average + "점 입니다.");
        
        if(com >= 2.5 && java >= 2.5 && math >= 2.5 && opera >= 2.5 && badminton >= 2.5) {
        	System.out.println("다음 학기 장학금 대상자 입니다.");
        }
    }
    
    public static double getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Double.parseDouble( inputString );
    }
}
