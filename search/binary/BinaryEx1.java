package search.binary;

public class BinaryEx1 {
	static int[] arr = { 1, 3, 5, 7, 8, 10, 20, 35, 99, 100 };

	public static void main(String[] args) {
		System.out.println("1. 순환 호출을 이용한 이진 탐색");
		System.out.println(binarySearch1(5, 0, arr.length - 1));
		System.out.println("\n2. 반복을 이용한 이진 탐색");
		System.out.println(binarySearch2(5, 0, arr.length - 1));

	}

	// 재귀구조
	static int binarySearch1(int key, int low, int high) { // low: 왼쪽, high: 오른쪽
		int middle = (low + high) / 2;
		
		if(low>high) {	// 없는 값을 검색시 stackOverFlow 예외가 발생하지 않도록 예외처리
			return -1;
		}
		if (key == arr[middle]) {
			return middle;
		}
		if (key < arr[middle]) {
			return binarySearch1(key, low, middle - 1);
		}
		if (key > arr[middle]) {
			return binarySearch1(key, middle + 1, high);
		}
		return -1;

	}

	// 반복구조
	static int binarySearch2(int key, int low, int high) {

		while (low <= high) {
			int middle = (low + high) / 2;
			
			if(low>high) {	// 없는 값을 검색시 stackOverFlow 예외가 발생하지 않도록 예외처리
				return -1;
			}
			if (key == arr[middle]) {
				return middle;
			}
			if (key < arr[middle]) {
				high = middle - 1;
			}
			if (key > arr[middle]) {
				low = middle + 1;
			}

		}
		return -1;
	}
}
