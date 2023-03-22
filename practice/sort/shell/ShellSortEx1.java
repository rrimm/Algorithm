package sort.shell;

import java.util.Arrays;

public class ShellSortEx1 {

	public static void main(String[] args) {
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		Sort S = new Sort();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
			System.out.println();
			S.shellSort(a, size);
		
	}
}

class Sort {

	public void shellSort(int a[], int size) {

		int interval = size / 2;

		while (interval >= 1) {

			for (int i = 0; i < interval; i++) {
				intervalSort(a, i, interval);

			}

			System.out.println(Arrays.toString(a));

			interval = interval / 2; // 간격이 1이 될 때까지 반복

		}
	}

	public void intervalSort(int a[], int begin, int interval) { // 정렬 작업
		int i, j;
		int temp;
		int size = a.length;

		i = begin + interval;

		while (i < size) {

			temp = a[i]; // 기존원소와 간격을 둔 원소 값 저장(삽입할 원소)

			j = i - interval; // 기존원소 위치

			while (j >= begin && a[j] > temp) { // 기존 배열의 내용을 계속 탐색중일 때

				a[j + interval] = a[j];
				j = j - interval;
			}

			a[j + interval] = temp;	//a[j] > temp(temp가 저장할 위치 확정)일 때 실행

			i = i + interval;

		}
	}
	

}

	
	
