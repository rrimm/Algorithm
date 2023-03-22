package ex7.queue.doublylinkedlist;

public class QueueExample {

	public static void main(String[] args) {
		
		char deletedItem;
		DeQueue DQ = new DeQueue(); // 큐
		
		
		DQ.insertFront('A'); // A 삽입
		DQ.printQueue(); // A 출력

		DQ.insertFront('B'); // B 삽입
		DQ.printQueue(); // AB 출력

		DQ.insertRear('C'); // C 삽입
		DQ.printQueue(); // ABC 출력

		deletedItem = DQ.deleteFront(); 
		if (deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		DQ.printQueue();
		
		DQ.insertRear('D'); // D 삽입
		DQ.printQueue(); 
		
		DQ.insertFront('E'); 
		DQ.printQueue(); 
		
		DQ.insertFront('F'); 
		DQ.printQueue(); 
		
		DQ.printQueue();
	}

}

