package Function;

import java.util.Arrays; //배열들을 관리하는 타입!
import java.util.Scanner;

public class FunctionEx1 {
	public static void main(String[] args) {
 
 // 함수
 //  - 긴 명령문을 한 단어로 바꾸는 것!
 
 // 반복되는 명령문을 중복을 제거하기 위해서 만든 것
 // 함수
 
 // 함수의 종류
 //  - 자바에서 제공하는 함수들
 //    println(),nextInt(),..
 System.out.println("원하는 결과를 출력!");
 //  - 사용자 정의 함수
 //   개발자가 본인이 원하는 명령들 묶어놓은 것!
 
 /*
 * 함수명 : grade
 * 
 * 국어 영어 수학  3개의 점수를 입력!
 * 각각의 등급을 출력 
 * 90점 이상 A
 * 80점 이상 B
 * 70점 이상 C
 * 60점 이상 D
 * 나머지는 싹다! F!
 * 국어 등급: A 다!
 * 영어 등급: B 다!
 * 수학 등급: C 다!
 */
 
 Scanner sc = new Scanner(System.in);
 
// System.out.println("국어->영어->수학:");
// int kor = sc.nextInt();
// int eng = sc.nextInt();
// int math = sc.nextInt();
// 
 // 알고리즘 
 //  배열하고 문자열(String) 기능중에서 문자를 쪼개는 기능!
 // int 타입으로 100 80 50 받을 수 없다!
 // String 타입을 이용해서 입력을 한꺼번에 받을 수 있다!
 
 // split(구분문자를 입력)
 //  구분 문자를 이용해서 자른다.
 //  이때 여러개의 데이터를 저장할 수있도록
 //  배열로 결과를 담는다.
 System.out.println("국어 영어 수학 (공백 기준으로 점수입력):");
// System.out.println("국어/영어/수학 (/기준으로 점수입력):");
 
 String input = sc.nextLine();	
 String[] result = input.split(" ");
 
 for(String str : result) {
 System.out.println(str);
 }
 System.out.println();
// 배열을 출력할 때는 위에 처럼 반복문을 이용해서 출력!
//      Arrays.toString() 배열을 하나의 문자열로 변경해준다.
 // {"100","58","58"}
 // "{100,58,58}"
 String to = Arrays.toString(result);
 System.out.println(to);
 
// System.out.println(input.split("/"));
 
 
 
 
	}
}