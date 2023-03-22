package testpair;

public class LinkedStack implements Stack {	
	private StackNode top;
	
	public LinkedStack() {	
	}
	
	@Override
	public boolean isEmpty() { // 빈 스택인지 체크

			return (top == null);
	}

	@Override
	public void push(char item) { // 데이터 삽입
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode; 		// 데이터 삽입
		
		}

	@Override
	public char pop() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		char item = top.data;
		top = top.link;
		return item;
	}

	@Override
	public void delete() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("empty");
		}
		top = top.link;

	}

	@Override
	public char peek() { // 스택 포인터(top)위치 데이터 값만 반환
		if (isEmpty()) {
			System.out.println("empty");
			return 0;
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

//		 if (isEmpty()) {
//	            System.out.printf("Linked Stack is empty!!");
//	        }
//	        StackNode temp = top;
//
//	        System.out.printf("Linked Stack>> ");
//	        StringBuilder answer = new StringBuilder();
//	        while (temp != null) {
//	            answer.append(temp.data).append(" ");
//	        }
//	        System.out.println(answer.reverse());
//	    }

	}
}
