package core_java;
import java.util.Stack;
public class Java45_Stack {
	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		
		System.out.println(list);
		
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
	}
}
