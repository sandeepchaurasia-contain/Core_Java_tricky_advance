package core_java;
import java.io.*;
public class Java28_IOStream {
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("ab.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		bos.write("my buffered data are write ".getBytes());
		bos.close();
		System.out.println("successfully write.....");
		
		System.out.println("start to read data from the file...............");
		
		FileInputStream fis=new FileInputStream("ab.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int ch;
		while((ch=bis.read())!=-1) {
			System.out.print((char)ch);
		}
		
		bis.close();
		
	}

}
