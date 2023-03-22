package sort.merge;

import java.util.Arrays;

public class MergeSortEx1 {

	public static void main(String[] args) {
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		Sort S = new Sort();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
		System.out.println();
		S.mergeSort(a, 0, size-1);

	}
}

class Sort {

	private int sorted[] = new int[8]; // sort할 때 원본데이터를 바꾸면 안되고 부분적으로 정리한 데이터를 임시로 정리할 배열 필요

	public void merge(int a[], int begin, int middle, int end) { // 병합 메소드
		int i, j, k, t;
		
		i = begin;
		j = middle + 1;
		k = begin;
		// 분할된 배열 병합
		while (i <= middle && j <= end) { // i: begin쪽에 정렬되는 데이터 위치, j: end쪽에 정렬되는 데이터 위치
			if (a[i] <= a[j]) {
				sorted[k] = a[i++];	// 왼쪽
			}
			if (a[i] > a[j]) {
				sorted[k] = a[j++];	// 오른쪽
			}
			k++;

		}

		if (i > middle) {	//왼쪽(i쪽)이 먼저 머지가 끝났을 때(오른쪽이 남아 오른쪽의 데이터를 처리)
			for (t = j; t <= end; t++, k++) {
				sorted[k] = a[t];
			}
		}

		// 오른쪽이 먼저 머지가 끝났을 때(왼쪽이 남아 왼쪽의 데이터를 처리)
			for (t = i; t <= middle; t++, k++) {
				sorted[k] = a[t];
			}
		

		for (t = begin; t <= end; t++) {	// 단계별 정렬 결과 저장
			 a[t]=sorted[k];
			 System.out.println("\n병합 정렬 >> ");
			 System.out.println(Arrays.toString(a));
		}
		


		
		

	}

	

	public void mergeSort(int a[], int begin, int end) { // 전체 집합을 두개의 부분집합으로 분할
		int middle;

		if (begin < end) {
			middle = (begin + end) / 2;
			mergeSort(a, begin, middle);	// 분할된 영역의 왼쪽
			mergeSort(a, middle + 1, end); // 분할된 영역의 오른쪽. 스택에 상태 보관
			merge(a, begin, middle, end); // 정렬 및 병합. 스택에 상태 보관
		}

	}
}
