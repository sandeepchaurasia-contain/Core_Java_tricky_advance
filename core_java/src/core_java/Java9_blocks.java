package core_java;

public class Java9_blocks {
	Java9_blocks()
	{
		
		System.out.println("constructor ");
	}
	
	{
		System.out.println("initialization block  ");
	}
	
	static {
		System.out.println("static ");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Java9_blocks obj=new Java9_blocks();
		
	}

}
