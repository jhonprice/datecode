package bigdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test3 {

	public static void main(String[] args) throws IOException{
		String s1=new String();
		char c;
		int flag=2;
		//String s2=new String();
		try
		{
			BufferedReader in=new BufferedReader(new FileReader("F://������//test.csv"));
			s1=in.readLine();
			int I=1;
			while((s1=in.readLine())!=null)
			{
				String s2=new String();
				if(I==1)
				{
					for(int j=0;j<s1.length();j++)
					{
						if(s1.charAt(j)>=48 && s1.charAt(j)<=57)
							System.out.print(s1.charAt(j));
					}
					System.out.println(",");
				}
				
				/*---------------------------------------------------------*/
				if(I!=1)
				{
					int ind=s1.indexOf("Ԫ");
					while(ind!=-1)
					{
						System.out.print(s1.indexOf("Ԫ",ind)+" // ");
						ind=s1.indexOf("Ԫ",ind+2);
					}
					System.out.print("  ///");
						
				}
				/*---------------------------------------------------------*/
				I++;
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
