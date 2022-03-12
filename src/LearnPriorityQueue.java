import java.util.Comparator;
import java.util.PriorityQueue;
public class LearnPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by default min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(40);
		pq.offer(12);
		pq.offer(23);
		pq.offer(27);
		pq.offer(36);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		pq1.offer(40);
		pq1.offer(12);
		pq1.offer(23);
		pq1.offer(27);
		pq1.offer(36);
		
		System.out.println(pq1);
		
		pq1.poll();
		System.out.println(pq1);
		
		System.out.println(pq1.peek());
		
		
	}

}
