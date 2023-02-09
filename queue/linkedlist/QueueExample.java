package ex7.queue.linkedlist;

public class QueueExample {

	public static void main(String[] args) {
		
		char deletedItem;
		LinkedQueue LQ = new LinkedQueue(); // 큐

		LQ.enQueue('A'); // A 삽입
		LQ.printQueue(); // A 출력

		LQ.enQueue('B'); // B 삽입
		LQ.printQueue(); // AB 출력

		LQ.enQueue('C'); // C 삽입
		LQ.printQueue(); // ABC 출력

		deletedItem = LQ.deQueue(); 
		if (deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LQ.printQueue();
		System.out.println("peek : " + LQ.peek());
		
	}

}
