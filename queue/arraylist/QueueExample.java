package ex7.queue;

public class QueueExample {

	public static void main(String[] args) {
		int queueSize = 3;
		char deletedItem;
		ArrayQueue Q = new ArrayQueue(queueSize); // 큐

		Q.enQueue('A'); // A 삽입
		Q.printQueue(); // A 출력

		Q.enQueue('B'); // B 삽입
		Q.printQueue(); // AB 출력

		Q.enQueue('C'); // C 삽입
		Q.printQueue(); // ABC 출력

		deletedItem = Q.deQueue(); 
		if (deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		Q.printQueue();
		
		deletedItem = Q.deQueue(); 
		if (deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		Q.printQueue();
		
		deletedItem = Q.deQueue(); 
		if (deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		} 
		Q.printQueue();
		
		Q.enQueue('D'); // C 삽입
		Q.printQueue(); 
	}

}
