package core_java;
import java.io.*;
public class Java22_Exception {
	static void rf() throws IOException{
		FileReader fr=new FileReader("abc.txt");
	}
	public static void main(String[] args) {
		try {
			rf();
			
		}catch(IOException e) {
			System.out.println("File not Found.. "+e.getMessage());
		}
		
		
		
		int arr[]= {10,30,40};
		try {
		System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
