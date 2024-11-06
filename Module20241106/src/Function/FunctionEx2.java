package Function;

public class FunctionEx2 {

	// 변수를 생성한 범위가(함수가) 다르면
	// 중복적인 변수명을 사용할 수있다!
	
	
	public static void a() {
 int n1;
	}
	
	/*  매개변수 : 함수가 실행할 때 집어 넣어줘야되는 값의미한다.
 *  함수 : 입력과 출력!
 *  public static 내보내기타입 함수명(매개변수){
 *                (리턴타입) 
 *  }
 */
	
	
	public static String b() {
 int n1;
 String str = "B함수입니다.";
 return str; //내보내기 타입을 작성할 대는 void 대신 원하는 타입
	}
	
	public static void main(String[] args) {
 
 System.out.println(b());
 // b함수 안에 있는 str변수를 main함수에서 출력?
 // System.out.println(str);
 
 
 
 int n1 = 10;
 int n2;
 int n3;	
 
 a();
 
 
 // 변수
 //  - 값을 저장하는 공간
 //  - 생존 시간!
 
 // 지역변수
 //  - { } 중괄호와 중괄호 사이에 만들어진 변수
 //  - 중괄호가 { 변수를 생성한다.
 //  - } 닫히면 변수를 삭제한다.
 //  - 함수가 실행하면 변수를 생성하고 함수가 끝나면 삭제한다.
 //    함수안에 생성된 변수를 지역변수!
 
 // 전역변수 
	}
}