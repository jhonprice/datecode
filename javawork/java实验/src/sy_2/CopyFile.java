package sy_2;

import java.io.*;
public class CopyFile {

	public static void main(String[] args) throws IOException 
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		fin=new FileInputStream("D:/onedrive/我的代码/javawork/java实验/src/sy_2/myfile");
		fout=new FileOutputStream("D:/onedrive/我的代码/javawork/java实验/src/sy_2/yourfile");
		do
		{
			i=fin.read();
			if(i!=-1)
				fout.write(i);
			
		}while(i!=-1);
		fin.close();
		fout.close();
		System.out.println("Copy done");

	}

}
