package bigdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test7 {

	public static void main(String[] args) throws IOException {
		
		System.out.println(func("�Ϻ�"));

	}
	public static boolean func(String s) throws IOException
	{
		String bs=new String();
		BufferedReader bin=new BufferedReader(new FileReader("F://������//book.txt"));
		while((bs=bin.readLine())!=null)
		{
			if(s.equals(bs))
			{
				bin.close();
				return true;
			}
			else;
		}
		bin.close();
		return false;
		//return true;
		
		
	}

}
