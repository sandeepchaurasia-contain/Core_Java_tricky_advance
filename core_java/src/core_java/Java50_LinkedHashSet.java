package core_java;
import java.util.*;
public class Java50_LinkedHashSet {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		System.out.println(list);
		
		LinkedHashSet<Integer> hash=new LinkedHashSet<>(list);
		System.out.println(hash);
		
	}
}
