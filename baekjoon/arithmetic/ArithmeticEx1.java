package arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백준 10869
public class ArithmeticEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String[] str = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);

		System.out.printf("%d%n%d%n%d%n%d%n%d%n", A + B, A - B, A * B, A / B, A % B);

	}

}
//System.out.println("두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.");
