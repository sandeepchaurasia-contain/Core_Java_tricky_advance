package core_java;
interface Sum{
	void sum();
}
public class Java37_Lambda {
	public static void main(String[] args) {
		Sum s=new Sum() {
			public void sum() {
				System.out.println("no parametr lambda");
			}
		};
		s.sum();
	}

}
