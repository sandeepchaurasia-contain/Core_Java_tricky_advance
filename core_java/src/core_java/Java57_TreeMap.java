package core_java;
import java.util.*;
public class Java57_TreeMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		
		map.put(3, "java");
		map.put(2, null);
		map.put(1, null);
		
		System.out.println(map);
	}
}
