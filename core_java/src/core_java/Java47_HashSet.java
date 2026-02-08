package core_java;
import java.util.HashSet;
public class Java47_HashSet {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("ek");
		set.add("do");
		set.add("three");
		set.add("four");
		
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set);
		System.out.println(set.size());
	}
}
