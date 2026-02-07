package core_java;
interface Sum2{
	void show(int a, int b);
}
public class Java39_Lambda {
	public static void main(String[] args) {
		
		//first method of lambda 
		Sum2 s=(a,b)->{
			System.out.println("hello ="+(a+b));
		};
		s.show(10, 200);
		
		//second way of lambda fucntion
		Sum2 s1=(a,b)-> System.out.println("hello second ="+(a+b));
		s1.show(12,8);
	}
}
