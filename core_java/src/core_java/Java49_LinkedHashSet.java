package core_java;
import java.util.*;

public class Java49_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<>();
		
		set.add("apple");
		set.add("apple1");
		set.add("apple2");
		set.add("apple3");
		set.add("apple");//ignored no duplicate 
		
		System.out.println("LinkedhashSet: "+set);
		set.remove("apple");
		System.out.println(set);
		
		
		System.out.println(set.contains("apple1"));
		
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}
}
