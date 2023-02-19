package sort.bubble;

import java.util.Arrays;

public class BubbleEx1 {

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		Sort S = new Sort();
		System.out.println("\n정렬할 원소: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
			System.out.println();
			S.bubbleSort(arr);
		
//			System.out.println(arr);
	}

}

class Sort {
	public void bubbleSort(int arr[]) {
		int i, j,temp;

//		for (i = arr.length-1; i >0; i--) { 
			for(i = 0; i < arr.length; i++) {		
			for (j = 0; j < i; j++) { 
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
				
				
			}
			System.out.printf("\n선택 정렬 %d 단계 : ", i + 1);
			
			System.out.println(Arrays.toString(arr));
			
		}
		
	}
}
