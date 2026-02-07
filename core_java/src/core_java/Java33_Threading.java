package core_java;

public class Java33_Threading extends Thread {
	public void run() {
		while(true) {
			System.out.println("Daemon running.....");
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Java33_Threading t1=new Java33_Threading();
		t1.setDaemon(true);
		t1.start();
		
		
		 for (int i = 1; i <= 3; i++) {
	            System.out.println("Main working: " + i);
	            try {
	            		Thread.sleep(1500);
	            }catch(InterruptedException e) {}
	        }
		
		System.out.println("Main finished....");
	}

}
