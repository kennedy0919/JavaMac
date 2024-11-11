package Class;

// 함수를 실행하고 리턴하는 타입은 무조건 하나의 타입만 가능
// 여러개의 변수를 한 단어로 묶어주는 클래스!

// 배열은  new int[5] 같은 타입의 변수를 한꺼번에 여러개 생성!
// 클래스는 여러개의 변수(타입이 다른 변수들) 한꺼번에 여러개 생성!
class Person{
	String name;
	int age;
}

class Joins{
	
	// 이메일,비번,휴대폰번호 
	String email;
	String pw;
	String phoneNumber;
	
}
class Student{
	String name;
}


public class ClassEx1 {
	
	public static int ex1() {
 return 10;
	}
	public static double ex2() {
 return 1.12345;
	}
	
	//  info라는 함수를 만들 것!
	public static Person info() {
 
 // 공간 생성(변수)
 Person person1 = new Person();
 
 // 그 공간에 데이터를 저장 
 person1.name = "이서희";
 person1.age = 10;
 
 return person1;
	}
	
	// 회원가입을 실행하는 함수 
	public static Joins join() {
 
 // 공간생성!
 Joins join1 = new Joins();
 
 join1.email = "golfchild8069@gmail.com";
 join1.pw = "qwer1234";
 join1.phoneNumber = "010-1234-1234";
 
 return join1;
 
 
	}
	// stuInfo함수를 실행했을 때 
	// 학생의 이름,나이,학년,반
	public static void stuInfo() {
 return "이익준",19,3,2;
	}
	
	public static void main(String[] args) {
 
 
	}
}