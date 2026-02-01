package core_java;

public class Java7_InstanceBlock {
	{
		System.out.println("insatnce block-1 ....");
	}
	
	Java7_InstanceBlock()
	{
		
		System.out.println("constructor...");
	}
	
	{
		System.out.println("instance blcok -2");
	}
	
	public static void main(String[] args) {
		Java7_InstanceBlock obj=new Java7_InstanceBlock();
		Java7_InstanceBlock obj1=new Java7_InstanceBlock();
		
		
	}

/*
 * 
 * insatnce block-1 ....
instance blcok -2
constructor...
insatnce block-1 ....
instance blcok -2
constructor...*/
}

