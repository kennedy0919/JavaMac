package While;

public class WhileEx {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		
		while (num1<= 9) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			num2 = num2 + 1;
			if (num2 == 10) {
				num1 = num1 + 1;
				num2 = 1;
			}
			}
			

	}

}
