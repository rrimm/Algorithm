package ex7.queue.doublylinkedlist;

public interface Queue {
	boolean isEmpty();

	void insertFront(char item);

	void insertRear(char item);

	char deleteFront();

	char deleteRear();

	void removeFront();

	void removeRear();

	char peekFront();

}
