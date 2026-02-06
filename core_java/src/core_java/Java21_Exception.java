package core_java;

public class Java21_Exception {
	static void vote(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible for voting");
		}else {
			System.out.println("eligible to vote...");
		}
	}
	public static void main(String[] args) {
		vote(121);
	}
}
