package core_java;

public class Java3_FlowControlStatements {
	public static void main(String[] args) {
		
		System.out.println("if statements...........");
		int a1=18;
		if(a1==18) {
			System.out.println("Eligible for vote..");
		}
		
		System.out.println("if-else  statements...........");
		int a2=18;
		if(a2>=18) {
			System.out.println("u can vote ");
		}
		else{
			
			System.out.println("cant vote ..");
		}
		System.out.println("done... ");
		
		
		System.out.println("else_if ladder statements...........");
		int a3=40;
		if(a3<33)
			System.out.println("failed");
		else if(a3==33)
			System.out.println("passed with grace ..");
		else
			System.out.println("passed ");
		
		
		
		System.out.println("nested if statements...............>>>>>>");
		
		int a4=10;
		int a5=20;
		int a6=30;
		if(a4>a5)
		{
			//System.out.println("10 ");
		
			if(a4>a6)
			{
				System.out.println("10 is greater ");
			}
			else
			{
				System.out.println("30 is greater ");
			}
		}
		
		else
		{
			if(a5>a6)
				System.out.println("20");
			else
				System.out.println("30");
			
		
		}
			
		System.out.println("SWITCH CASE ................");
		System.out.println("""
		
		int num=33;
		switch(num)
		{
		case 1: 
			
			System.out.println("monday");
			.
			.
			.
		default:
		}
		
		
				""");
		
		
		System.out.println("star pattern make ............... using for loop");
		
		int no=5;
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=no-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
