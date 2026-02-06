package core_java;
import java.io.FileInputStream;
public class Java27_IOStream {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("abc.txt");
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fis.close();
	}

}
