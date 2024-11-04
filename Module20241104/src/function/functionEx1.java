package function; //폴더명

import java.util.Scanner;

public class functionEx1 { // 파일명

	// 함수를 묶는 공간
	public static void myFunc1() {
 Scanner sc = new Scanner(System.in);

 System.out.println("개수:");
 int size = sc.nextInt();

 // 내가 입력받은 개수만큼 배열공간 만들기
 int[] myArray = new int[size];

 // 배열의 공간의 번호를 저장하는 거! 하나 index
 // 1부터 숫자를 기억하는 변수 하나! num
 for (int index = 0, num = 1; index < size; index++) {
 myArray[index] = num;
 System.out.println(num);
 num = num + 1;
 }
	}

	public static void myFunc2() {

 String[] fruits = { "사과", "귤", "포도", "복숭아", "참외" };

 for (String fruit : fruits) {
 if (fruit.equals("귤")) {
 System.out.println(fruit);
 }
 }

	}

	public static void main(String[] args) {

 // 함수
 // - 긴 명령문을 한 단어로 줄인다.

 // 함수 실행시 함수이름만 하고 중괄호 붙이기
 myFunc2();
 
 myFunc1();
 
 myFunc2();
 
 myFunc1();
 
 
 

	}
	// 함수를 묶는 공간
}