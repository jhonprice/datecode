package sy_2;

import java.util.Scanner;
import java.io.*;
public class MyRandom {

	public static void main(String[] args) 
	{
		File f=new File("D:\\onedrive\\我的代码\\javawork\\java实验\\src\\sy_2\\a.txt");
		try
		{
			f.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		String str="abcdefghijklmnopqrstuvwxyz";
		try
		{
			FileWriter fw=new FileWriter(f);
			fw.write(str);
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		int a=-1;
		Scanner reader=new Scanner(System.in);
		while(a<0|a>25)
		{
			System.out.println("从键盘输入一个0~25的整数:");
			a=reader.nextInt();
		}
		try
		{
			RandomAccessFile inFile=new RandomAccessFile("D:\\onedrive\\我的代码\\javawork\\java实验\\src\\sy_2\\a.txt","r");
			inFile.seek(a);
			//System.out.println(a);
			Char c=inFile.readChar();
			inFile.close();
			System.out.println(c);
			//System.out.println("RandomFile.txt文件中第"+a+"个字符是"+c);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
