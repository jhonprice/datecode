package sy_2;
import java.io.*;
public class Basedata {

	public static void main(String[] args) 
	{
		FileOutputStream fout;
		FileInputStream fin;
		DataOutputStream dout;
		DataInputStream din;
		File f=new File("D:\\onedrive\\我的代码\\javawork\\java实验\\src\\sy_2\\baseData.txt");
		try
		{
			f.createNewFile();
		}
		catch(IOException e){}
		try
		{
			fout=new FileOutputStream(f);
			dout=new DataOutputStream(fout);
			dout.writeInt((int)10);
			dout.writeLong((long)12345);
			dout.writeFloat(3.1415926f);
			dout.writeDouble(9342342432.1213);
			dout.writeBoolean(true);
			dout.close();	
		}
		catch(IOException e){}
		try
		{
			fin=new FileInputStream(f);
			din=new DataInputStream(fin);
			System.out.println(din.readInt());
			System.out.println(din.readLong());
			System.out.println(din.readFloat());
			System.out.println(din.readDouble());
			System.out.println(din.readBoolean());
			din.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
		}
		catch(IOException e){}

	}

}
