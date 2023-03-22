package fibonacci;

import java.util.Scanner;

public class FibonacciExample1 {
	public static void main(String[] args) {
		

		int n;
		long result = 1l;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 => ");
		n = scan.nextInt();
		result = fact(n);

		System.out.printf("\n\n%d의 factorial 값은 %d입니다.\n", n, result);

	}

	static int fact(int n) {	// 재귀 호출
		int value;
		if (n <= 1) {
			System.out.printf("\nfact(1) 함수 호출!");
			System.out.printf("\nfact(1)값 1 반환!");
			return 1;
		}
		System.out.printf("\nfact(1) 함수 호출!");
		value = (n * fact(n - 1));
		System.out.printf("\n fact(%d)값 %d 반환!", n, value);
		return value;

	}

}