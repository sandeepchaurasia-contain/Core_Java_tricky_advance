package core_java;
interface Hello{
	void show();
}
public class Java36_FunctInterface {
	public static void main(String[] args) {
		Hello h=new Hello() {
			public void show() {
				System.out.println("functional interfaces....");
			}
		};
		h.show();
	}
}
