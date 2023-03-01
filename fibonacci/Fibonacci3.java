package fibonacci;

import java.util.Scanner;

public class Fibonacci3 {	// 배열 활용 피보나치 수열 구현
	public static void main(String[] args) {
		System.out.println("피보나치 수열을 구해서 출력하는 프로그램을 작성하시오.");

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 => ");
		int num = scan.nextInt();

		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		System.out.print(arr[0] + "\t" + arr[1] + "\t");

		for (int i = 2; i < num; i++) {

			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + "\t");

		}
	}

}
