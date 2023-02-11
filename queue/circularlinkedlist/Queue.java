package ex7.queue.circular;

public interface Queue {
	boolean isEmpty();

	void enQueue(char item);

	char deQueue();

	void delete();

	char peek();
}
