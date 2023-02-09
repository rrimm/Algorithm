package doublylinkedlist;

public class DoublyLinkedList {
private ListNode head;	// 리스트가 만들어지면 헤드 노드가 필요하므로 헤드 노드를 만들어줌. 노드 객체의 주소가 head에 저장될 수 있게 함
	
	public DoublyLinkedList() {	// 생성자
		head = null;
	}

	public void insertLastNode(Grade data) { // 마지막 추가 삽입을 위해 설계
		ListNode newNode = new ListNode(data); // 노드 생성 후 데이터 삽입
		
		Grade obj = null;

		if (head == null) { // 리스트가 비어있으면
			this.head = newNode; // newNode를 head로 함
			newNode.llink = null;	// 연결할 대상이 없으므로
			newNode.rlink = null;
			System.out.println("\n삽입 성공!!!");
			return;
		} else {

			ListNode temp = head;

			// 번호 중복 데이터 체크
			while (temp != null) {
				obj = temp.getData();
				if (data.getID() == obj.getID()) {
					System.out.printf("\n입력 오류 - 존재하는 번호임!!!\n");
					return;
				}

				temp = temp.rlink;

			}
			;

//		while(temp.rlink != null) { //새노드를 삽입하기 위해 마지막 노드로 이동
//			temp = temp.rlink;
//		}

			temp.rlink = newNode;
			newNode.llink = temp;

			newNode.rlink = null;

			System.out.println("\n삽입 성공!!!");
		}
	}

	public void deleteNode(Grade data) { // 마지막 노드 삭제
		ListNode temp;
		Grade obj = null;

		if (this.head == null) // 빈 리스트 일때
		{
			System.out.printf("\n삭제 오류-리스트에 데이터가 없음!!!\n");
			return;
		}

		if (this.head.rlink == null) { // ***리스트에 노드가 한 개만 있는 경우***
			temp = this.head;
			obj = temp.getData();
			if (data.getID() == obj.getID()) // 첫번째 노드의 번호와 일치하는 경우
			{
				System.out.printf("\n삭제 성공!!! \n");
				head = null; // 리스트 시작 포인터를 null로 설정한다.
				return;
			} else // 노드가 하나밖에 없는데 번호가 일치하지 않는 경우
			{
				System.out.printf("\n삭제 오류-일치하는 번호가 없음!!!\n");
			}

		} else { // ***리스트에 노드가 여러 개 있는 경우***
			temp = this.head;
			obj = temp.getData();
			if (data.getID() == obj.getID()) // 노드가 여러 개일때 첫번째 노드가 삭제할 노드인 경우
			{
				System.out.printf("\n삭제 성공!!!\n");
				this.head = this.head.rlink; // 후속 노드의 주소를 선행노드의 링크에 저장
				return;
			} else {

				temp = head;
				while (temp != null) {
					obj = temp.getData();
					if (data.getID() == obj.getID()) {
						System.out.printf("\n삭제 성공!!!\n");
						temp.llink.rlink = temp.rlink; // 후속 노드의 주소를 선행노드의 링크에 저장
						temp.rlink.llink = temp.llink;

						return;
					} else {

						temp = temp.rlink;
					}
				}
			}
			System.out.printf("\n삭제 오류-일치하는 번호가 없음!!!\n");
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
		while (temp != null) {
			obj = temp.getData();
			if (data.getID() == obj.getID()) {
				System.out.println("번호   이름   점수");
				System.out.println("===============");
//				System.out.printf("%3d  %3s %4d %n", obj.getBunho(), obj.getIrum(), obj.getJumsu());
				obj.printData();
				return;
			} else
				temp = temp.rlink;
		}
		System.out.println("검색 오류-일치하는 번호가 없음!!!");
	}

	public void printList() { // 링크가 null인 노드를 만날 때까지 반복 출력(마지막 데이터까지 다 출력)
		ListNode temp = this.head;
		if (this.head == null) {
			System.out.printf("\n리스트에 데이터가 없음!!!\n");
			return;
		}
		System.out.println();
		System.out.println("번호   이름   점수");
		System.out.println("===============");
		while (temp != null) {
			Grade data = temp.getData();
//			System.out.printf("%3d  %3s %4d %n", data.getBunho(), data.getIrum(), data.getJumsu());
			data.printData();
			temp = temp.rlink;
		}
		System.out.println("===============");
	}
}
