package core_java;
import java.util.*;

public class Java52_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("banana");
		set.add("banana1");
		set.add("banana2");
		set.add("banana3");
		set.add("banana3");
		set.remove("banana");
		//same as clear()  and size()
		//union=addAll()
		//intersection=retainAll()
		//diffrence=removeAll()
		System.out.println(set.contains("banana"));
	}
}
