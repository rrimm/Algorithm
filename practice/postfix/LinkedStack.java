package postfix;

public class LinkedStack<T>{	
	private StackNode<T> top;
	
	public LinkedStack() {	
	}
	
	
	public boolean isEmpty() { // 빈 스택인지 체크

			return (top == null);
	}

	
	public void push(T item) { // 데이터 삽입
		StackNode<T> newNode = new StackNode<>();
		newNode.data = item;
		newNode.link = top;
		top = newNode; 		// 데이터 삽입
		
		}
	
	
	public T pop() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		T item = top.data;
		top = top.link;
		return item;
	}

	
	public void delete() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("empty");
		}
		top = top.link;

	}

	
	public T peek() { // 스택 포인터(top)위치 데이터 값만 반환
		if (isEmpty()) {
			return null;
		}
		return top.data;

	}

	public void printStack() { // 스택의 내용을 출력
		
		if (isEmpty()) {
			System.out.printf("Linked Stack is empty!!");
		}
		
		StackNode temp = top;
		System.out.printf("Linked Stack>> ");

		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.link;
		}
		System.out.println();

	}
}
