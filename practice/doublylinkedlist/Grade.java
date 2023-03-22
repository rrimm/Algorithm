package doublylinkedlist;

public class Grade {
	private int stdid;
	private String name;
	private int score;

	public int getID() { // stdid에서 값을 반환, 읽어올 때 사용할 메소드. 접근자: 필드에 접근하기 위한 용도
		return stdid;
	}

	public void setID(int stdid) { // stdid에 값 저장할 때 사용할 메소드
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void printData() {
		System.out.printf("%3d %3s %4d %n", stdid, name, score);
	}
}
