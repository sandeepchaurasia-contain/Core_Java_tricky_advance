package core_java;

public class Java6_Constructor {
	
//	Java6_Constructor(){
//		System.out.println("default...");
//	}
	
	//parameterized
	int roll;
	String name;
	
	Java6_Constructor(int r,String n)
	{
		roll=r;
		name=n;
		
	}
	
	void show() {
		System.out.println(roll);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Java6_Constructor obj=new Java6_Constructor(1,"ram");
		Java6_Constructor obj1=new Java6_Constructor(2,"shyam");
		
		obj.show();
		obj1.show();
	}
}
