package testpair;

public class Ex7_3 {

	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack(); // 스택
		
		OptExp opt = new OptExp();
		String exp = "((3*5)-(6/2))";
		
		
			System.out.println(exp);
			if(opt.testPair(exp)) {
				System.out.println("괄호 맞음!");
			} else {
				System.out.println("괄호 틀림!");
			}
	}
}

class StackNode {
	char data;
	StackNode link;
	
}

class OptExp{	// 괄호 개수 짝 검사
	String exp;
	int expSize;
	char symbol, openPair;
	
	public boolean testPair(String exp) { // 파라미터: 수식 전달
		this.exp = exp;
		LinkedStack LS = new LinkedStack();
		expSize = this.exp.length();

		for (int i = 0; i < expSize; i++) {
			symbol = this.exp.charAt(i);

			switch (symbol) {

			case '(':
			case '[':
			case '{':

				LS.push(symbol);
				break;

			case ')':
			case ']':
			case '}':

				if (LS.isEmpty()) {
					return false;
				} else {
					openPair = LS.pop(); // openpair에 pop한 값 저장
					if ((openPair == '(' && symbol != ')') || // 괄호의 짝이 맞는지 확인
							(openPair == '[' && symbol != ']') || (openPair == '{' && symbol != '}')) {
						return false;
					}
					break;

				}
			}
		}

		if (LS.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
