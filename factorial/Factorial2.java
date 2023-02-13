package factorial;

import java.util.Scanner;

public class Factorial2 {	// 재귀함수 활용 factorial 계산

	public static void main(String[] args) {
		
		int num;
		long result = 1l;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 => ");
		num = scan.nextInt();

		
		System.out.println(factorial(num));
		
	}
	static long factorial(int n) {
		if(n > 0) {
			return n*factorial(n-1);
		}
		
		return 1;
		
		}
}
