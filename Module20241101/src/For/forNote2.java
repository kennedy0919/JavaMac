package For;

import java.util.Scanner;

public class forNote2 {

	public static void main(String[] args) {
		
		// 문제1) 인덱스를 입력받아 성적 출력
		 // 정답1) 인덱스 입력 : 1 성적 : 11점

		 // 문제2) 성적을 입력받아 인덱스 출력
		 // 정답2) 성적 입력 : 11 인덱스 : 1
		Scanner input = new Scanner(System.in);
		
		int[] arr = {5, 11};
		
		
		
		System.out.print("인덱스: ");
		int index_num = input.nextInt();
		System.out.println("성적: " + arr[index_num]);
		
		System.out.print("성적: ");
		int index_num2 = input.nextInt();
		for (int i = 0; i <=1; i++) {
			if (arr[i] == index_num2) {
				System.out.println("인덱스:" + i);
			}
		}
		
		

	}

}
