package doublylinkedlist;

class ListNode {	// 노드(Node)
	private Grade data;	// data의 직접 저장을 막고 생성자 등을 통해서만 저장하게 함
	public ListNode rlink;
	public ListNode llink;

	public ListNode() {
		this.data = null;
		this.rlink = null;
		this.llink = null;
	}

	public ListNode(Grade data) {
		this.data = data;
		this.rlink = null;
		this.llink = null;
	}
	

	public ListNode(Grade data, ListNode rlink, ListNode llink) {
		this.data = data;
		this.rlink = rlink;
		this.llink = llink;
	}

	public Grade getData() {
		return this.data;
	}
}
