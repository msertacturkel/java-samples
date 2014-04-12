import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class QueueTest {

	public static void main(String[] args) {
		CD cd1 = new CD(1, "the beatles", "1");
		CD cd2 = new CD(2, "a", "a");
		CD cd3 = new CD(3, "tb", "b");
		CD cd4 = new CD(4, "s", "c");
		System.out.println("USing peek:");
		
		Queue<CD> cdCollection=new LinkedList<CD>();
		cdCollection.offer(cd1);
		cdCollection.offer(cd2);
		cdCollection.offer(cd3);
		cdCollection.offer(cd4);
		for (int i = 0; i < cdCollection.size(); i++) {
			System.out.println(cdCollection.peek());
		}
		
		System.out.println("using poll");
		for (int i = 0; i < cdCollection.size(); i++) {
			System.out.println(cdCollection.poll());
		}
	}

}
