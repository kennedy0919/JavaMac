package Array;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		/*
		 * 
		 * #숫자 이동[1단계]
		 * 
		 * # 리스트를 이용해서 리스트 안에 값이 2 인 ===> 주인공 옷 # 숫자 1 ---> 왼쪽으로 이동 # 숫자 3 ---> 오른쪽으로 이동
		 * # 단! 좌 우 끝에 도달했을 때 ,예외적인 처리 # 더이상 옆으로 이동 x
		 * 
		 * # 0은 빈공간 __ # 2은 주인공 옷
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		int[] game = new int[7];
		
		int player = 3;
		
		game[player] = 2;
		
		while(true) {
			System.out.println("숫자1: 왼쪽으로 이동");
			System.out.println("숫자1: 오쪽으로 이동");
			int input_num = input.nextInt();
			
			if (input_num == 1) {
				if (player != 0) {
					game[player] = 0;
					player = player - 1;
					game[player] = 2;
				}
			}
			
			if (input_num == 3) {
				if (player != 6){
					game[player] = 0;
					player = player + 1;
					game[player] = 2;
				}
			}
			
			
 			for (int i : game) {
				if (i == 0) {
					System.out.print("_");
				}
				if (i == 2) {
					System.out.print("옷");
				}
			}
 			System.out.println("");
		}
		
	}
}