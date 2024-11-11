package Class;

// 클래스를 만들수있다.

// 클래스 이름은 영문자로 작성!
// 첫번째 글자는 무조건 대문자!

class Member {
	String id;
	String name;
	String password;
	String email;
	char gender;
	int age;
}

class Cookie{
	String name;    // 쿠키명
	char grade;     // 등급 S,A,B
	int hp;         // 목숨 160
	String ability; //능력	
}


public class ClassEx2 {

	public static void main(String[] args) {

 // 쿠키  4명을 저장하는 배열 
 Cookie[] cookList = new Cookie[4];
 
 // Cookie 객체 생성
        Cookie cranberryCookie = new Cookie();
        Cookie wineCookie = new Cookie();
        Cookie agentCookie = new Cookie();
        Cookie coconutCookie = new Cookie();

        // 필드에 직접 접근하여 값 설정
        cranberryCookie.name = "크랜베리맛 쿠키";
        cranberryCookie.grade = 'S';
        cranberryCookie.ability = "상태전환 8단";
        cranberryCookie.hp = 160;

        wineCookie.name = "와인맛 쿠키";
        wineCookie.grade = 'S';
        wineCookie.ability = "차원 이동 8단";
        wineCookie.hp = 160;

        agentCookie.name = "요원맛 쿠키";
        agentCookie.grade = 'S';
        agentCookie.ability = "장애물 회피, 사격 8단";
        agentCookie.hp = 160;

        coconutCookie.name = "복고맛 쿠키";
        coconutCookie.grade = 'S';
        coconutCookie.ability = "과거로 리셋 8단";
        coconutCookie.hp = 160;
 
 
 // 공간 생성
 Member mem1 = new Member();

 // 데이터를 저장
 
 mem1.name = "박신우";
 mem1.age = 33;
 mem1.password = "aa";
 mem1.id = "aaaa";
 mem1.email = "aa@aa.com";
 mem1.gender = 'F';
	
 
 // 출력(확인)
 System.out.println("직원1 이름:" + mem1.name);

 Member mem2 = new Member();
 // 데이터를 저장
 mem2.name = "강고결";
 mem2.age = 33;
 mem2.password = "aa";
 mem2.id = "aaaa";
 mem2.email = "aa@aa.com";
 mem2.gender = 'F';

 System.out.println("직원2 이름:" + mem2.name);

 Member mem3 = new Member();
 // 데이터를 저장
 mem3.name = "남나눔";
 mem3.age = 33;
 mem3.password = "aa";
 mem3.id = "aaaa";
 mem3.email = "aa@aa.com";
 mem3.gender = 'F';

 System.out.println("직원3 이름:" + mem3.name);
 
 Member[] memberList =  new Member[10];
 
//각각의 쿠키를 배열에 저장한다.
 cookList[0] = cranberryCookie;
 cookList[1] = wineCookie;
 cookList[2] = agentCookie;
 cookList[3] = coconutCookie;
 
 for(int i = 0; i < cookList.length; i++) {
 System.out.println("쿠키 " + i +"번째 이름:" 
   + cookList[i].name);
 }
 
// // 공간을 생성
// Dog dog1 = new Dog();
// Cat cat1 = new Cat();
//
// // 고양이와 강아지의 나이를 출력
// System.out.println("고양이 나이:" + cat1.age);
// System.out.println("강아지 나이:" + dog1.age);
// System.out.println("강아지 이름:" + dog1.name);
//
// Cat cat2 = new Cat();
// System.out.println("고양이2 나이:" + cat2.age);
//
// // 고양이의 이름을 각각 출력
// System.out.println("고양이 이름:" + cat1.name);
// System.out.println("고양이2 이름:" + cat2.name);

	}
}
//dog 
//이름,나이,색상 저장하는 클래스!
//댕댕이 , 2 , 노란색 (저장하는 값)

//클래스로 묶으면 자동으로 초기화하는 기능
//String  데이터가 없다 null
//int  0, double 0.0 ,char ' ' ,boolean false

class Dog {
	String name;
	int age;
	String color;
}

//cat
//이름,나이,색상 저장하는 클래스!
//나비 , 1 , 회색  ( 저장하는 값)
class Cat {
	String name = "나비";
	int age = 1;
	String color = "회색";
}
// 클래스를 만들 수 있다.