package core_java;

public class Java2_DataTypes {
	public static void main(String[] args) {
		int a=19;
		double d=10.9;
		char c='a';
		boolean b=true;
		float f=10.2f;
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(f);
		
		System.out.println("type  casting in java ");
		
		double db=a;
		System.out.println(db);// implecit conversion 
		
		// explicit conversion 
		int aa=(int)d;
		
		//int aaa=int(d);
		//System.out.println(aaa);erroe
		System.out.println(aa);
		
		
		
		//char casting 
		System.out.println("char casting done here ..............");
		char ch='a';
		int num=66;
		
		int ch1=ch;
		System.out.println(ch1);
		
		char ch2=(char)num;
		System.out.println(ch2);
	

	}

}
