package core_java;

public class Java3_Operator {
	public static void main(String[] args) {
		int a=10;
		int b=3;
		
		System.out.println("basic operations...... ARITHMATIC OPERATORS .......");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("important point of view ..........");
		int x=10/3;
		System.out.println(x);
		double d=(double)10/3;
		
		System.out.println(d);
		
		
		
		System.out.println("unary operators .....................");
		int n=10;
		System.out.println(n++);//10
		System.out.println(n);//11
		System.out.println(n--);//11
		System.out.println(n);//10
		System.out.println(++n);//11
		System.out.println(n++);//11
		System.out.println(n);//12
		
		
		System.out.println("RELATIONAL  OPERATORS .......");
		
		int aa=10;
		int bb=20;
		System.out.println(aa>bb);
		System.out.println(aa<bb);
		System.out.println(aa==bb);
		System.out.println(aa!=bb);
		System.out.println(aa<=bb);
		
		
		System.out.println("LOGICAL  OPERATORS .......");
		System.out.println("&&");
		System.out.println("||");
		System.out.println("!");
		
		
		System.out.println("Assignment operators ...........");
		System.out.println("""
				+=	add & assign	a += 5
				-=	subtract & assign	a -= 2
				*=	multiply & assign	a *= 3
				/=	divide & assign	a /= 2
				%=	remainder & assign	a %= 3""");
		
		
		System.out.println("TERNARY OPERATORS .............");
		int n1=10;
		 String result =(n1%2==0)? "even" : "odd";
		 System.out.println(result);
		 //(conditon) ? true : false;
		 
		 
	}
}
