package icehs.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = new int [3];
		
		scores[0] = 87;
		scores[1] = 93;
		scores[2] = 90;
		
		int totalScore = 0;
		
		for(int inx = 0; inx < scores.length; inx++) {
			totalScore += scores[inx];
		}
		
		double average = totalScore / scores.length;
		
		
		System.out.println("����: " + scores[0]);
		System.out.println("����: " + scores[1]);
		System.out.println("����: " + scores[2]);
		System.out.println("����: " + totalScore);
		System.out.println("���: " + average);
		
		
		
	}

}
