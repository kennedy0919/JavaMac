package ArrayListEx;

public class SwitchEx {

	public static void main(String[] args) {
		
		// if문은 조건을 따져서 실행을 한다.
		// true 이면 실행, false이면 elseㅁ누 실행!
		
		// 카테고리
		// switch() 괄호 안에 값을 넣음ㄴ 값의 카테고리로
		// 바로 이동한다.
		
		switch(1) {
		case 1:
			System.out.println("1이네!");
			break;
		
		case 2:
			System.out.println("2이네!");
			break;
		
		}
		
		switch("여성의류") {
		case "여성의류" :
			System.out.println("여성의류 확인!");
			break;
		case "남성의류" :
			System.out.println("남성의류 확인!");
		}
		
	}

}
