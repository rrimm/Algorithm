package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoEx2 {

	public static void main(String[] args) {	// 배열 활용 로또 번호 생성 예제
		System.out.println("자동으로 로또 번호 6개를 생성하여 출력하는 알고리즘을 구현하시오.");

		Random ran = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = ran.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {	// 중복 시 다시 출력
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) { // 선택정렬: 오름차순 출력
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print(Arrays.toString(arr));

	}

}

//자동으로 로또 번호 6개를 생성하여 출력하는 알고리즘을 구현하시오.
//<처리조건>
//1. 로또 번호는 Random 클래스를 사용하며 1부터 45까지 생성한다.
//2. 로또 번호 출력시 오름차순으로 출력하며 정렬은 선택정렬을 사용한다.
//3. 로또 번호는 중복을 허용하지 않는다.
//입력
//없음
//출력
//로또 번호 : 1 15 20 30 37 41

