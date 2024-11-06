package Function;

import java.util.Scanner;

public class FunctionTest1 {

	public static int sum(int i, int j) {
		int result = i + j;
		return result;
	}

	public static int minus(int i, int j) {
		int result = i - j;
		return result;
	}

	public static int max_num(int i, int j, int k) {

		if (i > j && i > k) {
			return i;
		}
		if (j > i && j > k) {
			return j;
		}
		if (k > i && k > j) {
			return k;
		}
		return 0;
	}
	
	public static void food(String str) {
		if (str.equals("앞")) {
			System.out.println("중국요리!");
		} else {
		System.out.println("스시 ㅎㅎ");
		}
	}

	public static void main(String[] args) {
		food("앞");
		/*
		 * 1.) 함수명 add 정수 두개 매개변수로 받아서 더하기 결과를 출력
		 * 
		 * 2.) sub 정수 두개를 매개변수로 받아서 빼기 결과를 출력
		 * 
		 * 3.) max 정수 세개를 매개변수로 받아서 제일 큰 숫자를 출력!
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();

		System.out.println(sum(i, j));
		System.out.println(minus(i, j));
		System.out.println(max_num(i, j, k));

	}

}
