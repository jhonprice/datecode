package bigdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test2 {

	public static void main(String[] args) throws IOException{
		String s1=new String();
		char c;
		int flag=2;
		//String s2=new String();
		try
		{
			BufferedReader in=new BufferedReader(new FileReader("F://������//test.csv"));
			s1=in.readLine();
			int i=1;
			while((s1=in.readLine())!=null)
			{
				String s2=new String();
				if(i==1)
				{
					for(int j=0;j<s1.length();j++)
					{
						if(s1.charAt(j)>=48 && s1.charAt(j)<=57)
							System.out.print(s1.charAt(j));
					}
					System.out.println(",");
				}
				i++;
				if(s1.charAt(s1.length()-1)=='"')
				{
					flag++;
					break;
				}
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}
}