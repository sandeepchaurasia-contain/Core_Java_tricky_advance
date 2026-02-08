package core_java;
import java.util.*;

public class Java53_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(50);
		pq.add(40);
		pq.add(30);
		pq.add(20);
		pq.add(10);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.size());
	}
}
