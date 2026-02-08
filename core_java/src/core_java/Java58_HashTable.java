package core_java;
import java.util.*;
public class Java58_HashTable {
	public static void main(String[] args) {
		Map<Integer,String> map=new Hashtable<>();
		
		map.put(1, "java");
		map.put(2, "java1");
		map.put(3, "java2");
		
		System.out.println(map);
	}
}
