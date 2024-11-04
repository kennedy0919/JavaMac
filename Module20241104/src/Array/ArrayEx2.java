package Array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {

 // 업그레이드 된 for문
 // 여러개의 데이터를 한꺼번에 담는 자료형!
 // 배열

 /*
 * for(타입 변수 : 배열명){ 반복을 실행하는 문장; }
 */

 // 정수 변수 5개를 한꺼번에 선언
// int[] arr = {1,2,3,4,5,6};
// System.out.println("배열의 개수:" + arr.length);
// 
// // 기존 for문은 조건을 무조건 주어야 실행!
// // 조건에 의해서 반복을 실행, while, 기존 for문
// 
// // 데이터의 개수만큼 자동으로 반복하는 for
// for(int num : arr) {
// System.out.println(num);
// }
// 
// String[] nameList = {"강동원",
// "이익준","김준완"
// ,"양석형","채송화"};
// 
// // 김준완 이름이 있니? 
// // 첫번째 반복이 실행되면 배열에서 0번째 값을 자동으로
// // 꺼내온다.
// boolean result = false; //못찾았다는 기준!
// 
// for(String name : nameList) {
// if(name.equals("김준완")) {
// System.out.println("있다.");
// }
// }
// 
// if(result == false) {
// System.out.println("못 찾았다.");
// }
// if(!result) {
// System.out.println("못 찾았다.");
// }
// 
// int[] arr2 = {1,2,3,4,5,6}; 
// 
// // 내가 특정 값들을 건너뛰기 할 수 있는 명령어들
// // 있다. continue
// 
// for(int num : arr2) {
// if(num == 3) {
// continue;
// }
// System.out.println(num);
// }
// 
// 
// for(int num : arr2) {
// if(num == 3) {
// System.out.println();
// }else {
// System.out.println(num);
// }
// }

 Scanner sc = new Scanner(System.in);

 // 기존 for문으로 무한반복을 할수 있다.
 while(true) {
 System.out.println("메뉴");
 System.out.println("1.추가");
 System.out.println("2.삭제");
 System.out.println("3.종료");

 int menu = sc.nextInt();
 
 if(menu < 1 || menu > 3) {
 System.out.println("제대로 입력!");
 continue;
 }

 if (menu == 1) {
 System.out.println();
 } else if (menu == 2) {
 System.out.println();
 } else if (menu == 3) {
 System.out.println();
 }

 }

	}
}