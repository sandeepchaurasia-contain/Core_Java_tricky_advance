package core_java;

public class Java19_Gc {
	
	protected void finalize()
	{
		System.out.println("gc run ");
	}
	void show() {
		System.out.println("my show ");
	}
	public static void main(String[] args) {
		Java19_Gc obj=new Java19_Gc();
		obj.show();
		
		obj=null;
		System.out.println(obj);
		System.gc();
		System.out.println(obj);
	}
}
