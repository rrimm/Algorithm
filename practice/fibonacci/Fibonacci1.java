package fibonacci;

import java.util.Scanner;

public class Fibonacci1 {	// 단순 연산으로 구현한 피보나치 수열

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 => ");
		int num = scan.nextInt();

		int a, b, sum;
		a = 0;
		b = 1;
		sum = 1;

		for (int i = 0; i < num; i++) {
			System.out.print(sum + "\t");
			sum = a + b;
			a = b;
			b = sum;
		}
	}

}
