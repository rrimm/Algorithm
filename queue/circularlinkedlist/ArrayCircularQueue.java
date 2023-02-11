package ex7.queue.circular;

public class ArrayCircularQueue implements Queue { // 배열을 이용한 원형 큐
	private int front; 
	private int rear;
	private int queueSize; // 큐 크기
	private char itemArray[]; // 큐로 사용될 배열

	public ArrayCircularQueue(int queueSize) {
		front = 0; // 초기값
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize]; // 문자데이터를 저장하는 큐
	}

	@Override
	public boolean isEmpty() { // 빈 큐인지 체크

		return (front == rear);
	}

	public boolean isFull() { // 가득찬 큐인지 체크
		if ((rear + 1) % (queueSize) == front) { // 공백과의 구분을 위해 front 자리를 항상 비워둠
			System.out.println("overflow");
			return true;
		}
		return false;

	}

	@Override
	public void enQueue(char item) { // 데이터 삽입

		if (isFull()) {
			System.out.println("overflow");
		} 
			int mod = (rear+1)%(queueSize);
			rear = mod;
			itemArray[rear] = item; // 데이터 삽입
			System.out.println("Inserted Item : " + item);
		

	}

	@Override
	public char deQueue() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		} 
			int mod = (front + 1) % queueSize;
			front = mod;
			return itemArray[front];
		
	}

	@Override
	public void delete() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("empty");

		}
		int mod = (front + 1) % queueSize;
		front = mod;

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
		}
		System.out.printf("ArrayQueue >> ");

		int mod1 = (front + 1) % queueSize;
		int mod2 = (rear + 1) % queueSize;
		int i = mod1;

		while (i != mod2) {	// rear과 front가 같아지면 반복문 빠져나옴
			System.out.print(itemArray[i]);
			i = ++i % queueSize;
		}
		System.out.println();
	}

}
