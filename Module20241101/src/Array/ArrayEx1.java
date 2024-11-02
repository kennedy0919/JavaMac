package Array; //폴더명

import java.util.Scanner;

public class ArrayEx1 { //자바파일명

	public static void main(String[] args) {
 
 int num = 10;
 
 // 변수의 단점 
 //   값을 하나만 저장을 하기 때문에 여러개의 값을 저장 못한다.
 
 // 배열(Array)  
 //   여러개의 값을 저장할 수있다.
 
 // 정수 여러개를 저장
 // 정수 5개를 한번에 저장할께!
 //         new 타입[공간의개수] 길이
 // 공간만 만들고 비워져있다.
 // 모두 공간이 0으로 초기화가 자동으로 일어난다.
 int[] arr1 = new int[5];
 
 // 10칸이 공간 모두 0.0
 double[] arr3 = new double[10];
 
 // 한 문자를 저장하는 타입 char
 //  빈공간으로 표현된다. 
 char[] arr4 = new char[10];
 System.out.println(arr4[0]);
 
 // 간편하게 배열을 만드는 방법
 // 공간을 만듬과 동시에 내가 원하는 값으로 초기화!
 int[] arr2 = {1,2,3,4,5,6}; 
 double[] arr5 = {1.1,2.2,3.3,4.4};
 char[] arr6 = {'H','O','L','1'};
 String[] nameArr = {"이서희","이지희","이정희"};
 
 System.out.println("nameArr[1] 이름:" + nameArr[1]); 
 System.out.println("arr1[0]: " + arr1[0]);
 System.out.println("arr2[0]: " + arr2[0]);
 
 System.out.println(arr1);
	
 
 // 자바는 여러개를 저장하는 배열은 한가지 타입으로만 만들 수있다.
 // 정수면 정수만 저장하는 배열
 // 실수면 실수만 저장하는 배열 
 
 // 자바에서는 여러가지 타입의 변수를 묶어서 사용하는 클래스!
 
 //  학생들의 점수를 저장하는 배열을 만들기!
 //  5명
 // 1. 공간만듬
 int[] stuScoreArr = new int[5];
 
 // 2. 각각의 공간에 값을 저장하기
 //  배열명[공간의번호] = 값;
 stuScoreArr[0] = 100;
 stuScoreArr[1] = 90;
 stuScoreArr[2] = 80;
 stuScoreArr[3] = 70;
 stuScoreArr[4] = 60;
 
 // 3. 결과 확인 (출력)
 System.out.println(stuScoreArr[0]);
 System.out.println(stuScoreArr[1]);
 System.out.println(stuScoreArr[2]);
 System.out.println(stuScoreArr[3]);
 System.out.println(stuScoreArr[4]);
 
 // 학생들의 키를 5명 저장하는 배열
 // 165.2 실수로 저장
 Scanner input = new Scanner(System.in);
 
 double[] heiArr = new double[5];
 
 heiArr[0] = 165.2;
 heiArr[1] = 150.1;
 heiArr[2] = 175.25;
 heiArr[3] = 184.2;
 heiArr[4] = 130.12;
 
 int cnt = 0;
 while (cnt <= 4) {
	 System.out.println("heiArr: " + heiArr[cnt]);
	 cnt = cnt + 1;
 }
 
 
 
 
	}
}