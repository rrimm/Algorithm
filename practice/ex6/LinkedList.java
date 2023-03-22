package ex6;

class LinkedList {
	private ListNode head;	// 리스트가 만들어지면 헤드 노드가 필요하므로 헤드 노드를 만들어줌. 노드 객체의 주소가 head에 저장될 수 있게 함

	public LinkedList() {	// 생성자
		head = null;
	}

	public void insertMiddleNode(ListNode pre, String data) {	// 중간 삽입을 위한 예제
		ListNode newNode = new ListNode(data);

		newNode.link = pre.link;
		pre.link = newNode;
	}

	public void insertLastNode(String data) {	// 마지막 추가 삽입을 위해 설계
		ListNode newNode = new ListNode(data);	// 노드 생성 후 데이터 삽입
		
		if (head == null) {	// 리스트가 비어있으면
			this.head = newNode;	// newNode를 head로 함
		} else {
			ListNode temp = head;
			while (temp.link != null) {
				temp = temp.link;	// temp가 가리키는 노드가 마지막 노드가 될 때까지 link를 따라 이동
			}	// temp가 가리키는 노드의 링크가 null이 되면 반복문 빠져나옴
				temp.link = newNode;	// 새로 삽입하는 노드의 주소가 입력된 newNode.  마지막 노드 뒤에 newNode 삽입 완료
		}
	}

	public void deleteLastNode() {	// 마지막 노드 삭제
		ListNode pre, temp;
		
		if (head == null) {		// 헤드가 빈 리스트일 때
			return;
		}

		if (head.link == null) {	// 리스트에 노드가 하나일 때
			head = null;
		} 
		else {	// 리스트에 노드가 최소 2개 이상 존재
			pre = head;
			temp = head.link;
			
			while (temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;	// 앞의 노드의 링크를 null로 만듦으로서 뒤의 노드로 연결하지 못하게 되고, 뒤의 노드는 삭제
		}
	}
	
	public void deleteMiddleNode(String data) { // 중간 노드 삭제
		ListNode pre, temp;

		if (head == null) {
			return;
		}
		if (head.link == null) { 	// 노드가 1개일 때
			if (head.getData() != data)
				return;
			else
				head = null;
		}

		else { 	// 노드가 최소 2개 이상 존재
			pre = head;
			temp = head.link;

			while (temp.getData() != data) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = temp.link;
		}
		
//		else { 	// 다른 예시
//			temp = head;
//			
//
//			if (temp.getData() != data) {
//		do {
//				pre = temp;
//				temp = temp.link;
//			if(temp == null)
//				break;
//		}
//		while(temp.getData() != data);
//		if(temp != null)
//			pre.link = temp.link;
//	}
//			else {
//			head = temp.link;
//		}
//		
			
	}
	
	public ListNode searchNode(String data) {	// 입력값에 해당하는 데이터를 가진 Node를 반환하는 메소드
		ListNode temp = this.head;
		while (temp != null) {
			if (data == temp.getData())	// temp의 데이터와 입력한 데이터가 일치하는 Node를 찾을 경우

				return temp;
			else
				temp = temp.link;	// 계속 탐색
		}
		return temp;
	}

	public void reverseList() {	// 역순으로 배치
		ListNode next = head;	// 다음에 바꿀 노드
		ListNode current = null;	// 현재노드
		ListNode pre = null;	// 선행노드
		while (next != null) {	// 순서를 바꿀 노드가 있다.
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
	}

	public void printList() {	// 링크가 null인 노드를 만날 때까지 반복 출력(마지막 데이터까지 다 출력)
		ListNode temp = this.head;	
		System.out.printf("L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
