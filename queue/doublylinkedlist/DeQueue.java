package ex7.queue.doublylinkedlist;

public class DeQueue implements Queue { // front, rear 모두에서 삽입, 삭제가 가능한 이중연결리스트 큐 Double End Queue(Deque)
	private QueueNode front;
	private QueueNode rear;

	public DeQueue() {
		front = null; // 초기값
		rear = null;
	}

	@Override
	public boolean isEmpty() { // 빈 큐인지 체크

		return (front == null);
	}

	@Override
	public void insertFront(char item) {	// dequeue 개념
		QueueNode newNode = new QueueNode();
		newNode.data = item;
		if (isEmpty()) { // 연결 큐가 공백인 경우
			System.out.println("empty");
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		} else {
			front.llink = newNode;
			newNode.rlink = front;
			newNode.llink = null;
			front = newNode;	// front(head)
		}
		System.out.println("Inserted Item : " + item);
	}
	
	@Override
	public void insertRear(char item) { // 데이터 삽입

		QueueNode newNode = new QueueNode();
		newNode.data = item;

		if (isEmpty()) { // 연결 큐가 공백인 경우
			System.out.println("empty");
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;

		} else {
			rear.rlink = newNode;
			newNode.rlink = null;
			newNode.llink = rear;
			rear = newNode;	// rear(tail)
		}
		System.out.println("Inserted Item : " + item);

	}

	@Override
	public char deleteFront() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");
			return 0;
		}  else {
			char item = front.data;
			if (front.rlink == null) {	// 노드가 1개
				front = null;
				rear = null;
			} else {
			front = front.rlink;
			front.llink = null;
			}
			return item;
			}
		}

	@Override
	public char deleteRear() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");
			return 0;
		} else {
			char item = rear.data;

			if (rear.llink == null) {
				rear = null;

			} else {
				rear = rear.rlink;
				rear.rlink = null;
			}
			return item;
		}

	}
	
	@Override
	public void removeFront() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");

		} else {
			char item = front.data;
			if (front.rlink == null) { // 노드가 1개
				front = null;
				rear = null;
			} else {
				front = front.rlink;
				front.llink = null;
			}

		}
	}

	@Override
	public void removeRear() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");

		} else {
			char item = rear.data;

			if (rear.llink == null) {
				rear = null;

			} else {
				rear = rear.rlink;
				rear.rlink = null;
			}

		}

	}
	
	@Override
	public char peekFront() { // 데이터 값만 반환(읽기만 함)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		return front.data;

	}
	
	
	public char peekrear() { // 데이터 값만 반환(읽기만 함)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		return rear.data;

	}

	
	public void printQueue() { // 큐 내용을 배열에 저장된 순서대로 출력
		if (isEmpty()) {
			System.out.println("Doubly Linked Queue is empty!!");
		} else {

			QueueNode temp = front;
			System.out.printf("Doubly Linked Queue>> ");

			while (temp != null) {
				System.out.print(temp.data);
				temp = temp.rlink;

			}
			System.out.println();
		}

	}

}

class QueueNode {
	char data;
	QueueNode rlink;
	QueueNode llink;
}
