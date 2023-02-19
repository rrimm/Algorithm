package sort.selection;

import java.util.Arrays;

public class SelectionSortEx2 {
	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		
		Sort2 S = new Sort2();
		
		System.out.println("\n정렬할 원소: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
		S.selectionSort(arr);

		
	}
​}

class Sort2 {
	public void selectionSort(int arr[]) {
		int i, j, min;
​
		for (i = 0; i < arr.length - 1; i++) { // 선택 정렬의 실제 비교 횟수: n-1번
			min = i; // 위치
			for (j = i + 1; j < arr.length; j++) { // 기준이 되는 수 제외 숫자를 비교하여 최소숫자를 찾음
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		
	}
}