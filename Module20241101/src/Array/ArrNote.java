package Array;

public class ArrNote {

	public static void main(String[] args) {
		
		int[] numArr = {10, 20, 30, 40, 50};
		
		
		int cnt = 0;
		int sum_num = 0;
		int count_cnt = 0;
		while (cnt <= 4) {
			if ((numArr[cnt] % 4) == 0) {
				System.out.println("4의 배수: " + numArr[cnt]);
				sum_num = sum_num + numArr[cnt];
				count_cnt = count_cnt + 1;
			}
			cnt = cnt + 1;
		}
		System.out.println("sum_num: " + sum_num);
		System.out.println("count_cnt: " + count_cnt);
		
		
	}

}
