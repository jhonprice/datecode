package sy_2;

import java.io.*;
public class File2 {

	public static void main(String[] args) throws IOException 
	{
		BufferedWriter out=new BufferedWriter(new FileWriter("a.txt"));
		out.write("上海电机学院");
		out.newLine();
		out.write("java程序设计");
		out.flush();
		out.close();

	}

}
