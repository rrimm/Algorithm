package sort.insert;

import java.util.Arrays;

public class TeacherInsertSortEx1 {

	public static void main(String[] args) {
		
			int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
			int size = a.length;
			Sort2 S = new Sort2();
			System.out.println("\n정렬할 원소: ");
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%d\t", a[i]);
			}
				System.out.println();
				S.insertionSort(a, size);
		}
	}

	class Sort2 {
		
		public void insertionSort(int a[], int size) {
			int i, j, temp;

			for (i = 1; i < size; i++) {	// i=1: 데이터 삽입 위치
				
				temp = a[i];	// 삽입할 데이터
				
				for(j=i; j>0 && (a[j-1] > temp); j--) {	// 기존 배열의 내용을 계속 탐색중일 때
					a[j] = a[j - 1];	// temp 데이터 삽입을 위해 위치가 하나씩 밀림
				}

				a[j] = temp;	// j가 0이거나 a[j-1] > temp(temp가 저장할 위치 확정)일 때 실행
				
				System.out.printf("\n삽입 정렬 %d 단계 : ", i);
				System.out.println(Arrays.toString(a));

			}

		}

	}

		