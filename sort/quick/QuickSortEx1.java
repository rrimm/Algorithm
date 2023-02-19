package sort.quick;

import java.util.Arrays;

public class QuickSortEx1 {

	public static void main(String[] args) {
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		Sort S = new Sort();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t", a[i]);
		}
			System.out.println();
			S.quickSort(a, 0, 7);
		
	}
}

class Sort {
	int i = 0;

	public int partition(int a[], int begin, int end) {
		int pivot, temp, L, R;

		pivot = (begin + end) / 2;
		L = begin;
		R = end;
		System.out.printf("\n퀵정렬 %d 단계 : pivot = %d", ++i, a[pivot]);
		while (L < R) {
			while ((a[L] < a[pivot]) && (L < R)) { // 왼쪽에서 교환할 데이터 찾는 작업
				L++;
			}

			while ((a[R] >= a[pivot]) && (L < R)) { // 오른쪽에서 교환할 데이터 찾는 작업
				R--;
			}
			
			
			if (L < R) { // 피봇 기준으로 교환할 데이터를 찾았을 때 L과 R 교환
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
				
//				if (L == pivot) { // l과 r을 교환했을 때 피봇 위치가 변경
//					System.out.println(Arrays.toString(a));
//					return R;
//				}
			}
		}
		// 피봇과 L, R이 만난 위치 데이터 교환
			temp = a[pivot]; // R과 피봇 교환
			a[pivot] = a[R];
			a[R] = temp;
			
			System.out.println(Arrays.toString(a));	// 단계별 수행결과 출력
			return R;
	
	}

	public void quickSort(int a[], int begin, int end) {

		if (begin < end) {
			int p;
			p = partition(a, begin, end);
			quickSort(a, begin, p - 1);	// 좌측 분할
			quickSort(a, p + 1, end);	// 우측 분할
		}

	}

}

	
	
