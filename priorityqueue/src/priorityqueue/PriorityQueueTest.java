package priorityqueue;

public class PriorityQueueTest {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub

		Priority_Queue<String>pq = new Priority_Queue<>();
		
		pq.insert("abc", 15);
		pq.insert("def", 13);
		
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}

}
