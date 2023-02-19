package postfix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PostfixEx1 {

	public static void main(String[] args) throws IOException {

		
		LinkedStack<String> S = new LinkedStack<>(); // 스택

		OptExp opt = new OptExp();
		String postfix = null;
		String exp = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// "((30+5)-(6/2))"
		System.out.println("수식 입력[ex:35*62/-] => ");
		exp = br.readLine();

		if (opt.testPair(exp)) { // 괄호 검사
            postfix = opt.infixTopostfix(exp); // 중위식을 후위식으로 변환
            System.out.println("후위식: " + postfix);
            System.out.println("연산결과: " + opt.evalPostfix(postfix));
        } else {
            System.out.println("괄호 맞지 않음");
        }
	}

}

class StackNode<T> {
	T data;
	StackNode<T> link;
}

class OptExp {

	private String postfix;

	public boolean testPair(String exp) { // 파라미터: 수식 전달
		this.postfix = exp;
		LinkedStack<String> S = new LinkedStack<>();
		int expSize = this.postfix.length();
		String openPair;

		for (int i = 0; i < expSize; i++) {
			String symbol = this.postfix.substring(i, i + 1);
			switch (symbol) {
			case "(":
			case "{":
			case "[":
				S.push(symbol);
				break;
			case ")":
			case "}":
			case "]":
				if (S.isEmpty())
					return false;
				else {
					openPair = S.pop();
					if ((openPair == "(" && symbol != ")") || (openPair == "{" && symbol != "}")
							|| (openPair == "[" && symbol != "]"))
						return false;
					else
						break;
				}
			}
		}
		if (S.isEmpty()) {
			return true;
		}
		return false;
	}

	public String infixTopostfix(String postfix) { // 후위식 변환
		LinkedStack<String> S = new LinkedStack<>();
		StringBuilder output = new StringBuilder();
		StringTokenizer stok = new StringTokenizer(postfix, "*-+/)(", true); // true: 연산자도 같이 출력

		while (stok.hasMoreTokens()) {
			String token = stok.nextToken().trim();

			if (token.isEmpty()) {
				continue;
			}
			if (Character.isDigit(token.charAt(0))) {	// 숫자일 때
				output.append(token).append(" ");
			} else if (token.equals("(")) { // 여는 괄호
				S.push(token);
			} else if (token.equals(")")) { // 닫는 괄호
				while (!S.isEmpty() && !S.peek().equals("(")) {	// 스택이 비지 않았을 때
					output.append(S.pop()).append(" ");
				}
				S.pop(); // 여는 괄호 pop

			} else { // 연산자라면
				int precedence = getPrecedence(token);
				while (!S.isEmpty() && getPrecedence(S.peek()) >= precedence) {
					output.append(S.pop()).append(" ");
				}
				S.push(token);
			}
		}

		// Stack이 비어있지 않을 경우
		while (!S.isEmpty()) {
			output.append(S.pop() + " ");
		}

		return output.toString().trim();
	}

	private int getPrecedence(String operator) {
		switch (operator) {
		case "+":
		case "-":
			return 1;
		case "*":
		case "/":
			return 2;
		default:
			return 0;
		}
	}
	
	public int evalPostfix(String postfix) { // 후위식을 이용해서 연산결과 출력
		LinkedStack<Integer> S = new LinkedStack<>();
		StringBuilder val = new StringBuilder();
		
		int opr1, opr2, value;
		char testCh;

		for (int i = 0; i < postfix.length(); i++) {
			testCh = postfix.charAt(i);
			if (testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/') {
				if (testCh >= '0' && testCh <= '9') {
					val.append(testCh); // 수치문자를 val에 추가 저장
					continue;	// 두자리 이상의 숫자 가능하도록 구현하기 위함
				}
				if (val.length() != 0) {	// testCh값이 +-*/와 0~9가 아닌 경우(공백문자)
					value = Integer.parseInt(val.toString());	// 수치문자열을 숫자로 변환
					S.push(value);	// 수치문자열을 숫자로 변환한 값 스택에 저장
					val.delete(0, val.length());	// val 문자열 객체를 초기화 시킴
				}
			} else { // 연산자이면 피연산자를 스택에서 제거
				opr2 = S.pop();
				opr1 = S.pop();
				switch (testCh) { // 연산을 수행하고 스택에 저장
				case '+':
					S.push(opr1 + opr2);
					break;
				case '-':
					S.push(opr1 - opr2);
					break;
				case '*':
					S.push(opr1 * opr2);
					break;
				case '/':
					S.push(opr1 / opr2);
					break;
				}
			}
		}
		return S.pop();
	}
}		
	
