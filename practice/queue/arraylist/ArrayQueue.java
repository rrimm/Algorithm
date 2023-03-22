package ex7.queue;

public class ArrayQueue implements Queue { // 배열을 이용한 선형 큐
	private int front; 
	private int rear;
	private int queueSize; // 큐 크기
	private char itemArray[]; // 큐로 사용될 배열

	public ArrayQueue(int queueSize) {
		front = -1; // 초기값
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize]; // 문자데이터를 저장하는 큐
	}

	@Override
	public boolean isEmpty() { // 빈 큐인지 체크

		return (front == rear);
	}

	public boolean isFull() { // 가득찬 큐인지 체크
		return (rear == queueSize - 1);
	}

	@Override
	public void enQueue(char item) { // 데이터 삽입

		if (isFull()) {
			System.out.println("overflow");
		} else {
			itemArray[++rear] = item; // 데이터 삽입
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char deQueue() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		} else {
			return itemArray[++front];
		}
	}

	@Override
	public void delete() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("empty");

		} else {
			++front;	// front++도 가능

		}
	}

	@Override
	public char peek() { // 데이터 값만 반환(읽기만 함)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		return itemArray[front+1];
	}

	public void printQueue() { // 큐 내용을 배열에 저장된 순서대로 출력
		if (isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("ArrayQueue >> ");
			for (int i = front + 1; i <= rear; i++) {
				System.out.print(itemArray[i]);
			}
		}
		System.out.println();
	}

}
