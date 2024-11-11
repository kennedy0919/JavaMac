package Function;

import java.util.Scanner;


public class Functionnote2 {
	
	public static int dist(int i) {
		int pay = 0;
		if (i == 1) {
			pay = 5000;
		} else if (i == 2) {
			pay = 3000;
		} else if (i == 3) {
			pay = 2000;
		} else if (i == 4) {
			pay = 1000;
		}
		return pay;
	}
	
	public static int train(int i) {
		int pay = 0;
		if (i == 1) {
			pay = 10000;
		} else if (i == 2) {
			pay = 5000;
		} else if (i == 3) {
			pay = 3000;
		}
		return pay;
	}
	public static int sit(int i) {
		int pay = 0;
		if (i == 1) {
			pay = 0;
		} else if (i == 2) {
			pay = -2000;
		}
		return pay;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1. 춘천 2. 부산 3. 대구 4. 수원 중 목적지의 번호 입력하세요 : ");
		int dist = input.nextInt();
		System.out.print("1. KTX / 2. 새마을호 / 3. 무궁화호 중 하나의 번호 입력하세요 : ");
		int train = input.nextInt();
		System.out.print("좌석 / 입석 중 하나를 입력하세요 : ");
		int sit = input.nextInt();
		int pay = dist(dist) + train(train) + sit(sit);
		
		System.out.println("총 가격은 " + pay + "원 입니다.");
	}

}
