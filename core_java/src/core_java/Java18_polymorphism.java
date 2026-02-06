package core_java;

class Parent
{
	

	
	void show1() {
		System.out.println("show1");
	}
	void show() {
		System.out.println("Parent show()");
	}
}

class Child extends Parent
{

//	void show2() {
//		System.out.println("show2()");
//	}

	void show() {
		System.out.println("child show()");
	}
}

public class Java18_polymorphism {
	public static void main(String[] args) {
		Parent obj=new Child();
		obj.show();
		obj.show1();
		//obj.show2();
	}
}
