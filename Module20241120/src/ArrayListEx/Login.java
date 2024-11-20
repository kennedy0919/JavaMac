package ArrayListEx;

// 접근 제한자 public
//  - 같은 폴더에서든지 다른 폴더에서도 Login클래스를 가지고 가서
//    객체를 생성할 수있다.
public class Login {
	
	String id;
	String pw;
	
	// 특별한 메서드(클래스 안에 함수를 포함)
	// 클래스 안에 멤버들을 출력하는 기능
	// 변수명을 출력하면 자동으로 멤버들을 출력하는 기능
	@Override
	public String toString() {
		return "Login [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
	

}