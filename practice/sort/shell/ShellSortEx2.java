package sort.shell;

import java.util.Arrays;

public class ShellSortEx2 {

	public static void main(String[] args) {
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		Sort2 S = new Sort2();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
		System.out.println();
		S.shellSort(a, size);

	}
}

class Sort2 {

	public void shellSort(int a[], int size) {
		int i, interval, t = 0;
		interval = size / 2;

		while (interval >= 1) {

			for (i = 0; i < interval; i++) {
				intervalSort(a, i, size - 1, interval);

			}
			System.out.printf("\n삽입 정렬 %d 단계 : interval = %d >> ", ++t, interval);
			System.out.println(Arrays.toString(a));

			interval = interval / 2; // 간격이 1이 될 때까지 반복

		}
	}

	public void intervalSort(int a[], int begin, int end, int interval) { // 정렬 작업
		int i, j, temp;

		for (i = begin + interval; i <= end; i = i + interval) {

			temp = a[i]; 

			for (j = i - interval; j >= begin && a[j] > temp; j -= interval) { // 기존 배열의 내용을 계속 탐색중일 때. temp가 i - interval값을 보고 이전데이터보다 작으면

				a[j + interval] = a[j];
			}
			a[j + interval] = temp;

		}

	}

}
