package core_java;
import java.util.*;
public class Java56_LinkedHashMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		
		map.put(1,"Java");
		map.put(2,"Java2");
		map.put(3,"Java3");
		
		System.out.println(map);
	}
}
