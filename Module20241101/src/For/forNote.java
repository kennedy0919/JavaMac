package For;

import java.util.Random;
import java.util.Scanner;

public class forNote {

	public static void main(String[] args) {
		
		 // 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		 // 예   1) 87, 11, 92, 14, 47
		 
		 // 문제2) 전교생의 총점과 평균 출력
		 // 예   2) 총점(251) 평균(50.2)
		 
		 // 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		 // 예   3) 2명
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int[] score_arr = new int[5];
		
		for (int i = 0; i <= 4; i++) {
			score_arr[i] = r.nextInt(100) + 1;
		}
		
		int sum_score = 0;
		double average_score = 0;
		int passer = 0;
		
		for (int i = 0; i <= 4; i++) {
			System.out.println((i + 1) + "번 학생 점수: " + score_arr[i]);
			sum_score = sum_score + score_arr[i];
			if (score_arr[i] >= 60) {
				passer = passer + 1;
			}
		}
		average_score = (sum_score / (double) 5);
		
		System.out.println("총점: " + sum_score + " 평균: " + average_score);
		System.out.println("합격자수: " + passer);
		
	}

}
