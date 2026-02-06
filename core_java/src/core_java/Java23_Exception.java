package core_java;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg) {
		super(msg);
	}
}

public class Java23_Exception {
	static void vote(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("need 18+");
		}
		else {
			System.out.println("u can vote,..");
		}
	}
	public static void main(String[] args) {
		
		try {
			vote(16);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
