package core_java;

public class Java32_Threading extends Thread  {
	public void run()
	{
		System.out.println(" "+Thread.currentThread().getName()+":- Priority: "+Thread.currentThread().getPriority());
		
	}
	public static void main(String[] args) {
		Java32_Threading t1=new Java32_Threading();
		Java32_Threading t2=new Java32_Threading();
		Java32_Threading t3=new Java32_Threading();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
