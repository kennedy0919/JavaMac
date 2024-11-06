package Function;

import java.util.Scanner;

public class Functionnote {
	
	public static int Coffee(String coffee) {
		if (coffee.equals("Americano")) {
			return 3900;
		} else if (coffee.equals("Cafe mocha")){
			return 45000;
		} else if (coffee.equals("Cafe Latte")){
			return 50000;
		} else if (coffee.equals("Green tee Latte")){
			return 55000;
		}
		return 0;
	}
	
	public static int train(String size) {
		if (size.equals("G")) {
			return 1000;
		} else if (size.equals("R")){
			return 500;
		} else if (size.equals("S")){
			return 0;
		}
		return 0;
	}
	
	public static int price(int i, int j) {
		return i + j;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Harry Cafe");
		System.out.print("Choose 1 : Americano / Cafe mocha / Cafe Latte / Green tee Latte ");
		String coffee = input.next();
		System.out.println("");
		System.out.print("Choose size: G(grande) / R(regular) / S(short) : ");
		String size = input.next();
		int i = Coffee(coffee);
		int j = train(size);
		System.out.println("총 금액은 " + price(i, j) + "원 입니다.");
		
	}

}
