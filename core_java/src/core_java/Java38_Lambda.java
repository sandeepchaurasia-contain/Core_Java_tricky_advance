package core_java;
interface Sum1{
	void sum(int a);
}
public class Java38_Lambda {
	public static void main(String[] args) {
		//first way of lambda expression
		Sum1 s=(a)->{
			System.out.println("value is ;"+a);
			
	};
	s.sum(20);
		
		//OR secod way of lambda expression
		
		Sum1 s1=a->System.out.println(a);
		
		s1.sum(12);
	}
}
