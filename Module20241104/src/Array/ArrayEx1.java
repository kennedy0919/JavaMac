package Array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 정수 5개를 저장하는 배열 
		 // 배열의 단점이 한번 공간을 만들어놓으면 
		 // 추가하거나 삭제 되지 않는다. 
		 
		 //ArrayIndexOutOfBoundsException
		 // 예외발생함 . 공간이 없다는 뜻!
		 //arr[1] = 100;
		 
		 int[] arr2 = new int[5];
		 arr2[0] = 10;
		 
		 
		 int[] arr = {87, 11, 92, 14, 47};
		 // 문제1) 인덱스(공간번호)를 입력받아 성적 출력
		 // 정답1) 인덱스 입력 : 1 성적 : 11점
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("공간의 번호:");
		 int index = sc.nextInt();
		 
		 System.out.println(arr[index]); 

		 // 문제2) 성적을 입력받아 인덱스 출력
		 // 정답2) 성적 입력 : 11 인덱스 : 1
		 System.out.print("성적:");
		 int score = sc.nextInt();
		 
		 // 배열 또는 리스트 
		 int findIndex = -1; // 아무공간도 없다!
		 
		 boolean check = false;
		 
		// if(arr[0] == score) {
		// findIndex = 0;
		// 
		// }else if(arr[1] ==  score) {
		// findIndex = 1;
		// }
		 
		 for(int i = 0; i < 5; i++) {
		 if(arr[i] == score) {
		 //findIndex 값은 언제 변경 되냐면
		 // 점수가 배열안에 있을 때는 변경!
		 findIndex = i;
		 check = true;
		 System.out.println("찾았다 공간번호:"+ findIndex);
		 }
		 }
		 if(!check) { // not 연산자 결과를 뒤집는다.
		 //  !true - false로 변경되서 실행한다.
		 //  !false - true 로 변경되서 실행한다
		 System.out.println("공간 없음:"+ findIndex);
		 }
		 
		 
		 
		 
		 
		 

			}
		}

