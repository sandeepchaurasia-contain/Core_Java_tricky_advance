package core_java;
import java.util.ArrayList;
public class Java41_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		for(String num :list) {
			System.out.println(num+" ");
		}
		
		System.out.println("middle add elements:- \n ______________________");
		
		list.add(0,"zero");
		System.out.println(list);
		
		System.out.println("access elemets elements:- \n ______________________");
		System.out.println(list.get(1));
	
		System.out.println("set elements:- \n ______________________");
		list.set(1, "first");
		System.out.println(list);
		

		System.out.println("remove elements:- \n ______________________");
		list.remove(1);
		list.remove("zero");
		System.out.println(list);
		

		System.out.println("size of  list:- \n ______________________");
		int a=list.size();
		System.out.println("Size :- "+a);
		

		System.out.println("empty or not  elements:- \n ______________________");
	
		System.out.println(list.isEmpty());
		

		System.out.println("index find elements:- \n ______________________");
	
		System.out.println(list.indexOf("three"));
		

		System.out.println("clear list elements:- \n ______________________");
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		
	}

}
