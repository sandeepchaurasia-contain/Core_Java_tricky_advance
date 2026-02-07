package core_java;

public class Java34_Threading implements Runnable{
	public void run() {
		for(int i=0;i<11;i++) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		
		Java34_Threading t1=new Java34_Threading();
		Thread t=new Thread(t1);
		
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {}
		
		for(int i=11;i<21;i++) {
			
		
			System.out.println(i+" ");
		}
	} 

}
