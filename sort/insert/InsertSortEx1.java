package sort.insert;

import java.util.Arrays;

public class InsertSortEx1 {

	public static void main(String[] args) {
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		Sort S = new Sort();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
			System.out.println();
			S.insertionSort(a, size);
		
	}
}

class Sort {
	
	public void insertionSort(int a[], int size) {
		int i, j, temp;

		for (i = 1; i < size; i++) {
			
			temp = a[i];	// 삽입할 데이터
			j = i;	// j: 기존 데이터 위치
			
			while ((j > 0) && (a[j - 1] > temp)) {	// j = 0일 때: 초기데이터. 기존 배열의 내용을 계속 탐색중일 때
				a[j] = a[j - 1];
				j--;
			}

			a[j] = temp;	// j가 0이거나 a[j-1] > temp일 때 실행
			
			System.out.printf("\n삽입 정렬 %d 단계 : ", i);
			System.out.println(Arrays.toString(a));

		}

	}

}

	
	
