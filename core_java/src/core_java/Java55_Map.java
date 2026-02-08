package core_java;
import java.util.*;
public class Java55_Map {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "java");
		map.put(2, null);
		map.put(null,null);
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("java"));
		map.remove(1);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getKey()+" = "+e.getValue());
			
		}
	
	}
}
