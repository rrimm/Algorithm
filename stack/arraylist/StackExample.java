package ex7.stack;

public class StackExample {

	public static void main(String[] args) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize); // 스택

		S.push('A'); // A 삽입
		S.printStack(); // A 출력

		S.push('B'); // B 삽입
		S.printStack(); // AB 출력

		S.push('C'); // C 삽입
		S.printStack(); // ABC 출력

		deletedItem = S.pop(); // 가장 나중에 삽입된 값 삭제
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();
		System.out.println("peek : " + S.peek());
	}

}
