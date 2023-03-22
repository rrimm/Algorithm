package sort.bubble;

import java.util.Arrays;

public class TeacherBubbleSortEx1 {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		SortTeacher S = new SortTeacher();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
		S.selectionSort(arr);

	}
}

class SortTeacher {
	public void selectionSort(int arr[]) {
		int i, j, temp, size, flag;
		size = arr.length;
		for (i = 0; i < size - 1; i++) { // 선택 정렬의 실제 비교 횟수: n-1번
			System.out.printf("\n선택 정렬 %d 단계 : ", i + 1);
			flag = 0;
			for (j = 0; j < size - 1 - i; j++) { // 기준이 되는 수 제외 숫자를 비교하여 최소숫자를 찾음
				if (arr[j] > arr[j + 1]) { // 오름차순
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1; // 데이터 교환으로 값의 변화가 있음 표시
				}
			}

			for (int k = 0; k < size; k++) {
				System.out.printf("%3d ", arr[k]);
			}
			if (flag == 0) { // 반복 수행 종료 가능
				break;
			}

		}

	}
}
	
	
