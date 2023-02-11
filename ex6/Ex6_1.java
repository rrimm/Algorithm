package ex6;

public class Ex6_1 {

	public static void main(String[] args) {
		
		LinkedList L = new LinkedList();
		
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		L.insertLastNode("월");
		L.insertLastNode("수");
		L.insertLastNode("일");
		L.printList();

		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		ListNode pre = L.searchNode("수");
		
		if (pre == null) {
			System.out.println("검색실패>> 찾는 데이터가 없습니다.");
		}
		else {
			L.insertMiddleNode(pre, "금");
			L.printList();	// 월, 수, 금, 일로 출력
		}
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");	// 일이 first node
		L.reverseList();
		L.printList();

		System.out.println("(4) 리스트의 마지막 노드 삭제하기");
		L.deleteLastNode();
		L.printList();
		
		System.out.println("(4) 리스트의 중간 노드 삭제하기");
		L.deleteMiddleNode("금");
		L.printList();
	}
}
