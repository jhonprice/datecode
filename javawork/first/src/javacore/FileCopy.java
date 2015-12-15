package javacore;

import java.io.*;
public class FileCopy {

	public static void main(String[] args) {
		
		try
		{
			File inFile=new File("file1.dat");
			File outFile=new File("file2.dat");
			FileInputStream fis=new FileInputStream(inFile);
			FileOutputStream fos=new FileOutputStream(outFile);
			int c;
			while((c=fis.read())!=-1)
			{
				fos.write(c);
			}
			fis.close();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
