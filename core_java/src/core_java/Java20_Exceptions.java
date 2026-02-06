package core_java;

public class Java20_Exceptions {
	public static void main(String[] args) {
		System.out.println("start...");
		try {
			int a=10/2;
		}catch(ArithmeticException e) {
			System.out.println("can divide");
		}catch(Exception e) {
			System.out.println("exceptions");
		}finally {
			System.out.println("finally executed ");
		}
		
		System.out.println("end");
	}
}
