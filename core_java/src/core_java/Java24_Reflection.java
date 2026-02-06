package core_java;

class Student{
	private int id=101;
	
	public void show() {
		System.out.println("hello sandeep");
	}
}

public class Java24_Reflection {
	public static void main(String[] args)throws Exception {
		Class<?> c=Class.forName("core_java.Student");
		Object obj=c.getDeclaredConstructor().newInstance();
		java.lang.reflect.Method m=c.getMethod("show");
		m.invoke(obj);
		
		java.lang.reflect.Field f=c.getDeclaredField("id");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
	}
}
