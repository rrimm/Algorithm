package circularlinkedlist;

public class CircularLinkedList {
private ListNode head;	// 리스트가 만들어지면 헤드 노드가 필요하므로 헤드 노드를 만들어줌. 노드 객체의 주소가 head에 저장될 수 있게 함
	
	public CircularLinkedList() {	// 생성자
		head = null;
	}


	public void insertLastNode(Grade data) {	// 마지막 추가 삽입 = 첫번째 노드로 삽입
		ListNode newNode = new ListNode(data);	// 노드 생성 후 데이터 삽입
		ListNode pre = null;
		Grade obj = null;
		
		if (head == null) {	// 리스트가 비어있으면
			this.head = newNode;	// newNode를 head로 함
			newNode.link = newNode;	
			System.out.println("삽입 성공!!!");
			return;
		}
		
			ListNode temp = head;
			while (temp != head) {	// 번호 중복 데이터 체크

				obj = temp.getData();

				if (data.getID() == obj.getID()) {
					System.out.printf("\n입력 오류 = 존재하는 번호임!!!\n");
					return;
				}
				pre = temp;
				temp = temp.link;
			}
			pre.link = newNode;
			newNode.link = head ;		// 단순연결리스트와 차이가 되는 부분. head와 new를 연결하여 원형을 만듦
			System.out.println("\n삽입 성공!!!");
		
	}
	
	public void insertMiddleNode(ListNode pre, Grade data) { // 중간 삽입을 위한 예제
		ListNode newNode = new ListNode(data);
		
		if (head == null) {	// 리스트가 비어있으면
			this.head = newNode;	// newNode를 head로 함
			
			System.out.println("삽입 성공!!!");
			return;
		}
		
		newNode.link = pre.link;
		pre.link = newNode;
	}

	public void deleteNode(Grade data) { // 노드 삭제
		ListNode pre, temp;
		Grade obj = null;

		if (this.head == null) { // 헤드가 빈 리스트일 때
			System.out.printf("\n삭제 오류-리스트에 데이터가 없음!!!\n");
			return;
		}

		if (this.head.link == head) { // 리스트에 노드가 하나일 때
			temp = this.head;
			obj = temp.getData(); // 데이터 불러옴

			if (data.getID() == obj.getID()) { // 첫번째 노드의 번호와 일치하는 경우 data:. 삭제를 위해 입력받은 것 obj: 성적 데이터
				System.out.println("\n삭제 성공!!! \n");
				head = null; // 리스트 시작 포인터를 null로 설정한다.
				return;

			} else { // 노드가 하나밖에 없는데 번호가 일치하지 않는 경우
				System.out.printf("\n삭제 오류-리스트에 데이터가 없음!!!\n");
			}
		}

		else { // ***리스트에 노드가 여러 개 있는 경우***
			temp = this.head;
			obj = temp.getData(); // 데이터 저장됨

			if (data.getID() == obj.getID()) { // 노드가 여러 개일 때 첫번째 노드가 삭제할 노드인 경우
				System.out.println("\n삭제 성공!!! \n");
				while (temp.link != head) { // 마지막 노드가 head를 가리키도록 함
					temp = temp.link;
				}
				temp.link = head.link; // temp가 마지막 노드에 도달하여 첫번째 노드 삭제 후 다음 노드를 가리키며 원형 만듦
				this.head = this.head.link;
			} else { // 노드가 여러 개일 때, 첫번째 노드가 아닌 데이터를 삭제하는 경우
				pre = head; // 첫번째 노드의 주소 저장 pre가 필요한 이유는 삭제 후 선행과 후속 데이터를 연결하기 위해 선행 주소 필요하므로
				temp = head.link; // 두번째 노드의 주소 저장
				do {
					obj = temp.getData();
					if (data.getID() == obj.getID()) {
						System.out.println("\n삭제 성공!!! \n");
						pre.link = temp.link; // 후속 노드의 주소를 선행노드의 링크에 저장
						return;
					} else {
						pre = temp;
						temp = temp.link;
					}
				} while (temp != head);
			}
			System.out.println("\n삭제 오류 - 일치하는 번호가 없음!!!\n");
		}
	}
	
	
	public void searchNode(Grade data) { // 입력값에 해당하는 데이터를 가진 Node를 반환하는 메소드
		ListNode temp = this.head;
		Grade obj = null;

		if (this.head == null) {
			System.out.printf("\n리스트에 데이터가 없음!!!\n");
			return;
		}
		System.out.println();
		while (temp != head) {
			obj = temp.getData();
			if (data.getID() == obj.getID()) { // temp의 데이터와 입력한 데이터가 일치하는 Node를 찾을 경우
				System.out.println("번호\t이름\t점수");
				System.out.println("=================");
				obj.printData();
				return;
			} else
				temp = temp.link; // 계속 탐색
		}
		System.out.println("검색 오류 - 일치하는 번호가 없음!!!");
	}
	

	public void printList() {	// 전체 출력
		ListNode temp = this.head;	
		
		if(this.head == null) {
			System.out.printf("\n리스트에 데이터가 없음!!!\n");
			return;
		}
		
		System.out.println();
		System.out.println("번호\t이름\t점수");
		System.out.println("=================");
		
		do {
			Grade data = temp.getData();
			data.printData();
			temp = temp.link;
		} while (temp != head);
		System.out.println("=================");
	}

}
