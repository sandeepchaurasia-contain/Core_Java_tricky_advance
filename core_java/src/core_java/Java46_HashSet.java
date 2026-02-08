package core_java;
import java.util.HashSet;
import java.util.ArrayList;
public class Java46_HashSet {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("apple");
		set.add("apple1");
		set.add("apple2");
		set.add("apple3");
		set.add("apple");//ignored
		System.out.println("HashSet: "+set);
		
		set.remove("apple1");
		System.out.println("after remove: "+set);
		System.out.println(set.contains("apple"));
	
		ArrayList<String> arr=new ArrayList<>();
		arr.add("apple");
		arr.add("apple1");
		arr.add("apple2");
		arr.add("apple3");
		arr.add("apple");//ignored
		System.out.println(arr);
		
		HashSet<String> has=new HashSet<>(arr);
		System.out.println("HashSet: "+has);
		
	}
}
