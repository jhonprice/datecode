package sy_2;

import java.io.*;
public class File2 {

	public static void main(String[] args) throws IOException 
	{
		BufferedWriter out=new BufferedWriter(new FileWriter("a.txt"));
		out.write("�Ϻ����ѧԺ");
		out.newLine();
		out.write("java�������");
		out.flush();
		out.close();

	}

}
