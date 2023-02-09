package ex7.stack;

public class ArrayStack implements Stack { // 배열을 이용한 스택구조
	private int top;	// 스택 포인터
	private int stackSize;	// 스택 크기
	private char itemArray[];	// 스택으로 사용될 배열
	
	public ArrayStack(int stackSize) {	
		top = -1;	// 초기값
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];	// 문자데이터를 저장하는 스택. 성적 클래스를 저장하고 싶을 경우 char -> Grade로 변경할 수 있음
	}
	
	@Override
	public boolean isEmpty() { // 빈 스택인지 체크

		if (top == -1) {
			System.out.println("빈 스택");
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() { // 가득찬 스택인지 체크
		if (top >= stackSize) {
			System.out.println("가득찬 스택");
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void push(char item) { // 데이터 삽입

		if (isFull()) {
			System.out.println("overflow");
		} else {
//				top = 0;
				itemArray[++top] = item; // 데이터 삽입
			
		}

	}

	@Override
	public char pop() { // 데이터 삭제(데이터 반환 후)
		if (isEmpty()) {
			System.out.println("공백 스택");
			return 0;
		} else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() { // 데이터만 삭제(반환값 없음)
		if (isEmpty()) {
			System.out.println("공백 스택");

		} else {
			top--;

		}

	}

	@Override
	public char peek() { // 스택 포인터(top)위치 데이터 값만 반환
		if (isEmpty()) {
			System.out.println("공백 스택");
			return 0;
		} 
			return itemArray[top];
		
	}

	public void printStack() { // 스택의 내용을 배열에 저장된 순서대로 출력

		for (int i = 0; i <= top; i++) {
			System.out.print(itemArray[i]);
		}
		System.out.println();
	}

}
