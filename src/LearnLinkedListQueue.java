import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		//inserting element in queue
		queue.offer(12);
		queue.offer(36);
		queue.offer(48);
		queue.offer(24);
		
		System.out.println(queue);
		System.out.println(queue.poll()); // pop the element from queue
		System.out.println(queue.peek()); // peek is used to which element is going to pop
		
		// there are three method more which is adjacent to above methods
	
		

	}

}
