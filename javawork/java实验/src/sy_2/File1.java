package sy_2;

import java.io.*;
public class File1 {

	public static void main(String[] args) throws IOException 
	{
		if(args.length==0)
		{
			System.out.println("û����Ҫ�������ļ�");
			System.exit(1);
		}
		for(int i=0;i<args.length;i++)
			new File(args[i]).createNewFile();
	}
	

}
