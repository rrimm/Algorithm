package sort.selection;

import java.util.Arrays;

public class SelectionSortEx1 {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		Sort S = new Sort();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
			System.out.println();
			S.selectionSort(arr);
		
			
	}
}

class Sort {
	public void selectionSort(int arr[]) {
		int i, j, min;

		for (i = 0; i < arr.length - 1; i++) { // 선택 정렬의 실제 비교 횟수: n-1번
//			min = i; // 위치
			for (j = i + 1; j < arr.length; j++) { // 기준이 되는 수 제외 숫자를 비교하여 최소숫자를 찾음
				if (arr[i] > arr[j]) { // 오름차순
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.printf("\n선택 정렬 %d 단계 : ", i + 1);
			
				System.out.println(Arrays.toString(arr));
			
		}

	}
}
	
	
