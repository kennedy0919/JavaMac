package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {

	public static void main(String[] args) {

		// ArrayList 배열(유동적인)
		// 자동으로 추가되고 삭제되는 공간을 만들어서 여러개의 데이터를
		// 저장할 수있다!
		// 정의 (함수를 만들거나 클래스를 만들때 실행하지 않은 상태, 또는 공간
		// 할당하지 않은 상태!)

		// 1. 배열의 공간을 먼저 생성한다. 빈 배열을 먼저 선언
		// 1. 추가 2. 삭제 3. 출력 0을 누르는 순간 종료!

		// switch문은 멈출때 break 근데 문제가 무한반복하는 while문
		// 안에 있을 경우에는 멈추질 않는다.

		// switch문을 무한반복안에 집어 넣을 경우에는 while문을
		// 멈출 수 있도록 키워드 return;

		Scanner sc = new Scanner(System.in);
		int menu = -1;

		// 유동적인 배열(빈 배열)
		// 이름을 저장하는 리스트
		// 파이썬 list = []
		ArrayList<String> list = new ArrayList<String>();

		// 로그인 클래스를 저장하는 리스트(배열)
		ArrayList<Login> loginList = new ArrayList<Login>();

		while (true) {
			System.out.println("1.추가 2.삭제.3출력 0.종료");
			menu = sc.nextInt();

			sc.nextLine(); // 먼저 버퍼를 비워준다.
			switch (menu) {
			case 0:
				System.out.println("종료합니다.!");
				return; // 함수종료! 즉 프로그램을 완전히 종료!

			case 1:
				System.out.println("추가!");
				System.out.print("아이디:");
				String id = sc.nextLine();

				System.out.print("비번:");
				String pw = sc.nextLine();

				// 유동적인 배열에 Login클래스의 객체를 먼저 생성

				Login temp = new Login();

				// 클래스의 멤버들에 저장
				temp.id = id;
				temp.pw = pw;

				// 유동적인 배열에 저장
				// 1. 배열에 공간을 생성
				// 자동으로 인덱스(공간의 번호)설정된다.
				// 2. 내가 만든 객체를 저장!
				loginList.add(temp);

				System.out.println(loginList.size());

				break;
			case 2:
				System.out.println("삭제!");
				// 1. 삭제할 값을 주면 된다.
				// 삭제할 아이디를 입력받아서
				// 검색!
				// 2. 삭제할 아이디가 있으면 삭제!
				// 없으면 없는데~ 출력!

				System.out.print("삭제할 아이디:");
				String deleteId = sc.nextLine();

				// 삭제가 되면 정상적으로 삭제되었습니다. 출력
				// 삭제할 데이터가 없으면 "검색한 아이디가 없습니다" 출력
				for (Login temp2 : loginList) {
					if (temp2.id.equals(deleteId)) {
						// 같다는 것은 삭제할 객체라는것!
						loginList.remove(temp2);
						System.out.println(deleteId + "는 삭제되었습니다.");
						break;
					} else {
						System.out.println("일치하는 아이디가 없습니다.");
						break;
					}
				}

				break;
			case 3:
				System.out.println("출력!");
				System.out.println(loginList);
				break;
			}

			// 9시20분에 시작
			// TestMain 객체 배열을 이용해서 저장하는
			// 문제를 풀어주시면 됩니다~

		}

		// 위에 문제가 메모리에 저장을 하다보니깐
		// 프로그램이 실행할 때마다 입력하고 프로그램이 끝나면
		// 삭제된다. 계속 입력을 해야되는 불편함!

		// 한번 입력한 데이터를 영구적으로 저장!
		// 데이터베이스!(DB)
		// 컴퓨터 종료되도 데이터를 저장!
		// mysql(무료) , 오라클 (무료,유료)

		// 서버(server)
		// - 정보를 제공하는 컴퓨터 (네이버,유튜브)

		// 클라이언트 (client)
		// - 정보를 요청! 네이버 웹툰 보여줘. 유튜브동영상 내놔!

	}
}

// Login@7d417077
// 타입    @메모리주소

/*
 * 
 * package ArrayListEx;
 * 
 * import java.util.ArrayList; import java.util.Scanner;
 * 
 * public class ArrayListEx1 {
 * 
 * public static void main(String[] args) {
 * 
 * // ArrayList 배열(유동적인) // 자동으로 추가되고 삭제되는 공간을 만들어서 여러개의 데이터를 // 저장할 수있다! // 정의
 * (함수를 만들거나 클래스를 만들때 실행하지 않은 상태, 또는 공간 // 할당하지 않은 상태!)
 * 
 * // 1. 배열의 공간을 먼저 생성한다. 빈 배열을 먼저 선언 // 1. 추가 2. 삭제 3. 출력 0을 누르는 순간 종료!
 * 
 * // switch문은 멈출때 break 근데 문제가 무한반복하는 while문 // 안에 있을 경우에는 멈추질 않는다.
 * 
 * // switch문을 무한반복안에 집어 넣을 경우에는 while문을 // 멈출 수 있도록 키워드 return;
 * 
 * Scanner sc = new Scanner(System.in); int menu = -1;
 * 
 * // 유동적인 배열(빈 배열) // 이름을 저장하는 리스트 // 파이썬 list = [] ArrayList<String> list =
 * new ArrayList<String>();
 * 
 * // 로그인 클래스를 저장하는 리스트(배열) ArrayList<Login> loginList = new ArrayList<Login>();
 * 
 * 
 * while(true) { System.out.println("1.추가 2.삭제.3출력 0.종료"); menu = sc.nextInt();
 * 
 * sc.nextLine(); // 먼저 버퍼를 비워준다. switch(menu) { case 0:
 * System.out.println("종료합니다.!"); return; // 함수종료! 즉 프로그램을 완전히 종료!
 * 
 * case 1: System.out.println("추가!"); String name = sc.nextLine();
 * 
 * // 유동적인 배열에 추가 add(값); list.add(name);
 * 
 * // 비어있는 배열에 추가를 하면 // 데이터가 추가 되는것 이기때문에 // 공간이 늘어난다.
 * System.out.println(list.size());
 * 
 * break; case 2: System.out.println("삭제!"); break; case 3:
 * System.out.println("출력!"); System.out.println(list); break; }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 */