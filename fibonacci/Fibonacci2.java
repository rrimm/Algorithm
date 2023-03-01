package fibonacci;

import java.util.Scanner;

public class Fibonacci2 {	// 재귀함수 활용 피보나치 수열 구현

	public static void main(String[] args) {
		System.out.println("피보나치 수열을 구해서 출력하는 프로그램을 작성하시오.");	// 재귀함수 사용

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 => ");
		num = scan.nextInt();

		for (int i = 0; i <= num; i++) {

			System.out.print(fibonacci(i)+"\t");

		}
	}
		
	static int fibonacci(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2) ;
		
		}

}
