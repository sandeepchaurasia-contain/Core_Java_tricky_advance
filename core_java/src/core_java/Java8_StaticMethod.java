package core_java;

public class Java8_StaticMethod {
	static {
		System.out.println("static vlock 1");
	}
	
	Java8_StaticMethod()
	{
		
		System.out.println("constructor...");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		new Java8_StaticMethod();
		new Java8_StaticMethod();
	}

}
