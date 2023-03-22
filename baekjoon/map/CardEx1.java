package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 백준 10815번
public class CardEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 상근이가 가진 숫자 카드의 개수
		int N = Integer.parseInt(br.readLine());

		// 숫자 카드에 적힌 정수
		ArrayList<Integer> cardList = new ArrayList<>();
		StringTokenizer str1 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			cardList.add(Integer.parseInt(str1.nextToken()));
		}

		// 주어진 정수의 개수
		int M = Integer.parseInt(br.readLine());
		// 주어진 정수
		StringTokenizer str2 = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(str2.nextToken());

			if (cardList.contains(num)) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
	}

}
//5
//6 3 2 10 -10
//8
//10 9 -5 2 3 4 5 -10