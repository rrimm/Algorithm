package sort.bubble;

import java.util.Arrays;

public class BubbleEx2 {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		Sort2 S = new Sort2();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
			System.out.println();
			S.bubbleSort(arr);
		
	}

}

class Sort2 {
	public void bubbleSort(int arr[]) {
		int i, j, temp;

//			for(i = 0; i < arr.length; i++) {	
		for (i = arr.length - 1; i >= 0; i--) {
			

			for (j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
			System.out.printf("\n버블 정렬 %d 단계 : ", arr.length - i);
			System.out.println(Arrays.toString(arr));

		}
		
	}
}
