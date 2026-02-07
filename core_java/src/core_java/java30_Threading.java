package core_java;

public class java30_Threading extends Thread {
	public void run() {
		System.out.println("myThread1:-- "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		java30_Threading t1=new java30_Threading();
		t1.start();
		
		java30_Threading t2=new java30_Threading();
		t2.start();
	}

}
