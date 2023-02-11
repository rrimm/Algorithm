package ex6;

class ListNode {	// 노드(Node)
	private String data;	// data의 직접 저장을 막고 생성자 등을 통해서만 저장하게 함
	public ListNode link;	// 포인터, 링크필드를 나타내는 값. 레퍼런스 변수와 비슷한 개념. 노드로 객체를 만들었을 때 보관해야 함 링크필드의 타입: ListNode -> 객체의 주소가 ListNode이므로

	public ListNode() {
		this.data = null;
		this.link = null;
	}

	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}

	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}

	public String getData() {
		return this.data;
	}
}
