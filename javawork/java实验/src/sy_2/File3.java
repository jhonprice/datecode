package sy_2;

import java.io.*;
public class File3 {

	public static void main(String[] args) throws IOException
	{
		String thisLine;
		BufferedReader in=new BufferedReader(new FileReader("a.txt"));
		while((thisLine=in.readLine())!=null)
			System.out.println(thisLine);
		in.close();

	}

}
