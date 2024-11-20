package Class2;

class Car {
	String color;
	int price;
	int door;
	
	boolean 블루투스;
	boolean 엉따;
	boolean 통풍시트;
}


public class ClassEx2 {

	public static void main(String[] args) {
		
		// 사전예약 자동차
		Car car1 = new Car();
		
		Car[] list = new Car[20000];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = new Car();
		}
		
		
		
	}

}
