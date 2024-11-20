package ArrayListEx;


import java.util.ArrayList;
import java.util.Scanner;

class Member{
	// 클래스 안에 만들어지는 변수들 필드
	String id;
	String name;
	String password;
	String email;
	char gender;
	int age;
	
	public Member(String id, String name, String password, String email, char gender, int age) {
 
 this.id = id;
 this.name = name;
 this.password = password;
 this.email = email;
 this.gender = gender;
 this.age = age;
	}
	
	
	
	
}

public class ArrayListnote {

	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);

	 // 여러명을 저장하는 공간
	 ArrayList<Member> memberList = new ArrayList<Member>();
	 
	 int select = 0;
	 // 무한반복을 돌린 이유는 9번을 누르지 않는 동안
	 // 프로그램이 계속 실행!
	 while (true) {
	 System.out.println("\n--- 회원 관리 시스템 ---");
	 System.out.println("1. 새 회원 등록");
	 System.out.println("2. 회원 검색");
	 System.out.println("3. 회원 정보 수정");
	 System.out.println("4. 회원 삭제");
	 System.out.println("5. 모두 출력");
	 System.out.println("9. 끝내기");
	 System.out.print("메뉴 선택: ");
	 
	 //키보드로 입력 
	 // 숫자를 입력받고 엔터를 버퍼가 기억!
	 // 숫자를 입력하고 그 다음에 문자를 입력하면 
	 // 버퍼에 남아있는 엔터를 그대로 저장
	 select = sc.nextInt();
	 //버퍼를 비우는 명령어! 
	 sc.nextLine();
	 
	 while (true) {
		 switch(select) {
		 
		 case 1:
			 System.out.print("이름:");
			 String name = sc.nextLine();
			 System.out.print("이메일:");
			 String email = sc.nextLine();
			 System.out.print("비번:");
			 String password = sc.nextLine();
			 System.out.print("아이디:");
			 String id = sc.nextLine();			
			 return;
		 }
		 System.out.println("제대로 입력해라!");

	 }
	 
//	 if(select == 1) {
//	 
//	 System.out.print("이름:");
//	 String name = sc.nextLine();
//	 System.out.print("이메일:");
//	 String email = sc.nextLine();
//	 System.out.print("비번:");
//	 String password = sc.nextLine();
//	 System.out.print("아이디:");
//	 String id = sc.nextLine();
//	 
//	 System.out.print("성별:");
//	 char g = sc.nextLine().charAt(0);
//	 
//	 System.out.print("나이:");
//	 int age = sc.nextInt(); 
//	 
//	 
//	 Member temp = new Member(id,name
//	 ,password,email
//	 ,g,age);
//	 
//	 System.out.println(temp.name);
//	 
//	 
//	 }else if(select == 2) {
//	 
//	 }else if(select == 3) {
//	 
//	 }else if(select == 4) {
//	 
//	 }else if(select == 5) {
//	 
//	 }else if(select == 9) {
//	 
//	 }else {
//	 System.out.println("제대로 입력해라!");
//	 }

	 }

		}

	}
	/*
	 * 1. 새 회원 등록 2. 회원 검색 3. 회원 정보 수정 4. 회원 삭제 5. 모두 출력 9. 끝내기 메뉴 번호 : 1 새 회원을
	 * 등록합니다. 아이디 : aaaaa 이름 : 박신우 비밀번호 : aa 이메일 : aaa@aaa.aaa 성별(M/F) : k 성별을 다시
	 * 입력하세요. 성별(M/F) : F 나이 : 33
	 * 
	 * 
	 * 메뉴를 출력해서 if문을 이용해서 각각 실행될 수있도록 코드 클래스를 만들 때는 생성자를 이용해서 데이터를 저장 후 출력!
	 * 
	 * 
	 */