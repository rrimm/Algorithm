package arraylist;

class ArrayList {
	static int MAX = 10;	// 전체 배열 크기
	static int cnt = 0;	// 성적이 추가될 때마다 개수 카운트(실제 입력받은 데이터 개수)
	Grade arr[];	// 이 배열에 전달받은 성적데이터 저장

	ArrayList() {	// 배열에 저장할 코드 구현
		this.arr = new Grade[MAX];
	}
	

	public void insertLastNode(Grade data) {	// "삽입 성공!!!" 메세지 띄움
		if(this.cnt == MAX) {
			System.out.println("\n메모리 풀(full)!!!\n");
			return;
		}
		this.arr[this.cnt++] = data;	// 데이터 입력 받음
		System.out.println("삽입 성공!!!");
		
	}

	public void printList() {	// 입력받은 전체 데이터를 출력 . 데이터가 없으면 데이터가 없다고 메세지
		
		if (this.arr.length == 0) {
			System.out.println("\n출력할 데이터가 없음!!!\n");
			return;
		}
		System.out.println(" 번호\t이름\t점수");
		System.out.println("=====================");
		for (int i = 0; i < this.cnt; i++) {
			System.out.printf("%3d    %3s   %4d %n", this.arr[i].getID(), this.arr[i].getName(), this.arr[i].getScore());
		}
		
	}

	public void searchNode(Grade data) {	// 동일한 번호를 가진 성적 개체 찾기

		for (int i = 0; i < this.cnt; i++) {
			if (arr[i].getID() == data.getID()) {
				System.out.println();
				System.out.println("번호\t이름\t점수");
				System.out.println("=================");
				System.out.printf("%3d    %3s   %4d %n", this.arr[i].getID(), this.arr[i].getName(), this.arr[i].getScore());
			}
		}
		System.out.println("\n검색할 데이터가 없음!!!\n");
	}

	public void deleteNode(Grade data) {
		for (int i = 0; i < cnt; i++) {
			if (arr[i].getID() == data.getID()) {
				for (int k = i; k < this.cnt - 1; k++) {
					this.arr[k] = this.arr[k + 1]; // 배열에서 중간데이터가 삭제되면 오른쪽 값이 빈 자리를 채우기 위해 한 칸씩 이동
				}
				this.cnt--; // 데이터가 꽉 찼을 때 에러 발생할 수 있음

				this.arr[cnt - 1] = null; // 마지막 위치에 남은 값을 null로 초기화
				System.out.printf("\n삭제 성공!!!\n");
				return;
			}
		}
		System.out.println("\n삭제할 데이터가 없음!!!\n");
	}
	
}
