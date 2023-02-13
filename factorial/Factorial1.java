package factorial;
import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		System.out.println("임의의 수(양의 정수)를 입력 받은 수에 대한 팩토리얼을 구하시오. (반복문 사용)");

		int num;
		long result = 1l;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 => ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {

			result *= i;

		}

		System.out.println(result);

	}
	
	

}
