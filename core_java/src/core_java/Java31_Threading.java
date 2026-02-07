package core_java;

public class Java31_Threading implements Runnable{
	public void run() {
		System.out.println("my Thread 1:"+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Java31_Threading());
		t1.start();
	}
	
}
