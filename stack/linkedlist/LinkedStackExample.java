package ex7.stack.linkedlist;

public class LinkedStackExample {

	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack(); // 스택

		LS.push('A'); // A 삽입
		LS.printStack(); // A 출력

		LS.push('B'); // B 삽입
		LS.printStack(); // AB 출력

		LS.push('C'); // C 삽입
		LS.printStack(); // ABC 출력

		deletedItem = LS.pop(); // 가장 나중에 삽입된 값 삭제
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LS.printStack();
		System.out.println("peek : " + LS.peek());
	}

}

class StackNode {
	char data;
	StackNode link;
}