package core_java;
import java.util.LinkedList;
public class Java43_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("List :- "+list);
		
		list.addFirst(5);
		list.addLast(50);
		
		System.out.println("After add first and last : "+list);
		
		list.removeFirst();
		
		System.out.println("After remove first: -"+list);
	}

}
