package core_java;
import java.io.FileOutputStream;
public class Java26_IOStream {
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("abc.txt");
		String s="hello java how are u";
		fos.write(s.getBytes());
		fos.close();
		System.out.println("Data written....");
	}

}
