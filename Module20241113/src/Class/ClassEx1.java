package Class;

class A {
	int num;  // 정수 하나를 저장하는 클래스!
}

class Account {
	private int password;
	private int money;
}

class NaverJoin {
	private String id;
	private String pw;
	String phone;
}

public class ClassEx1 {

	public static void main(String[] args) {
		// 배열을 이용해서 내가 만든 클래스를 저장 할 때
		// 데이터를 저장하는 변수를 먼저 생성을 해여된다.
		Student[] list1 = new Student[5];
		
		Student stu1 = new Student();
		list1[0] = stu1;
		
		list1[0].name = "이서희";
		list1[0].subject = "Java";
		list1[0].score = 100;
		
		System.out.println(list1[0].name);
		
		
		
		
//		Account acc1 = new Account();
//		acc1.password = 1234;
	
		
//		A a1 = new A();
		
//		a1.num = 10;
//		System.out.println(a1.num);
		// 자바를 개발하다 보면은 main() 함수는 하나만 존재하는게 좋다!
		// 각각의 클래스 파일들은 main 함수가 있는 클래스 파일에서 
		// 작성하지 않고 각각 자바 파일을 만들어서 사용!
		
		// 접근제어자
		// - 각각의 파일이 어떤 폼더에서변수를 생성할 수 있는지
		//   없는지 제어하기 위해서 사용하는 것!
		
		// 4가지 종류
		// 1. private (비공개)
		//    - 나(클래스) 말고 다른 사람들(클래스)은 접근 불가
		
	}

}
