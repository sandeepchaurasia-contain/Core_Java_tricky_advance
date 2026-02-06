package core_java;
import java.io.*;
public class Java29_IOStream {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.txt"));
		dos.writeInt(10);
		dos.writeDouble(99.77);
		dos.writeBoolean(true);
		dos.close();
		
		DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		dis.close();
		
	}

}
