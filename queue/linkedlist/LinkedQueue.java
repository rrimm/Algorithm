package ex7.queue.linkedlist;

public class LinkedQueue implements Queue { // 연결리스트 큐
	private QueueNode front; 
	private QueueNode rear;
	

	public LinkedQueue() {
		front = null; // 초기값
		rear = null;
	}

	@Override
	public boolean isEmpty() { // 빈 큐인지 체크

		return (front == null);
	}

//	public boolean isFull() { // 가득찬 큐인지 체크
//		
//	}

	@Override
	public void enQueue(char item) { // 데이터 삽입

		QueueNode newNode = new QueueNode();
		newNode.data = item;
		newNode.link = null;

		if (isEmpty()) { // 연결 큐가 공백인 경우
			System.out.println("empty");
			front = newNode;
			rear = newNode;
			return;
		}
		rear.link = newNode;
		rear = newNode;
		System.out.println("Inserted Item : " + item);

	}

	@Override
	public char deQueue() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		} 
		char item = front.data;
		front = front.link;
		
		if(front == null) {
			rear = null;
		}
		return item;
		
	}

	@Override
	public void delete() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("empty");
		}
		front = front.link;
		if(front == null) {
			rear = null;
		}

	}

	@Override
	public char peek() { // 데이터 값만 반환(읽기만 함)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		return front.data;

	}

	public void printQueue() { // 큐 내용을 배열에 저장된 순서대로 출력
		if (isEmpty()) {
			System.out.printf("Linked Queue is empty!!");
		}
		
		QueueNode temp = front;
		System.out.printf("Linked Queue>> ");

		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.link;
			
			}
		
		System.out.println();
	}

}

class QueueNode {
	char data;
	QueueNode link;
}
