package core_java;

public class Java4_3TypeOfVariable {
	
	//instance variable 
	int roll=110;
	static int count=11;
	
	
	
	
	
	// local variables 
	static void show ()
	{
		int x=10;
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		Java4_3TypeOfVariable ob=new Java4_3TypeOfVariable();
		System.out.println(ob.roll);
		System.out.println(count);
		show();
		
		
	}

}
