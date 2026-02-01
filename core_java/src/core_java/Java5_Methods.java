package core_java;
//   main() → add() → return → main()     _----> important line 
public class Java5_Methods {
	//method with parameter 
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	//mwthod without return 
	// without parameter 
	
	public static int add1(int a,int b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		add(10,30);
		add(40,23);
		
		int sum=add1(20,40);
		System.out.println(sum);
	}

}
