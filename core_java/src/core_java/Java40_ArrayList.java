package core_java;
import java.util.*;
public class Java40_ArrayList {
	public static void main(String[] args) {
		//Collection<Integer> c=new ArrayList<>();
		//Iterable<Integer> c=new ArrayList<>();//we can craete like this iterable have only method to for each so it cant have add method like that
		List<Integer> c=new ArrayList<>();
		c.add(10);
		c.add(5);
		c.add(10);
		System.out.println("before sort: "+c);
		System.out.println(c.get(0));
		
		Collections.sort((List<Integer>)c);
		
		System.out.println("after sort: "+c);
	}
}
