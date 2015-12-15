package bigdata;
import java.io.*;
public class test1 {

	public static void main(String[] args) throws IOException{
		String s1=new String();
		
		try
		{
			int I=1;
			BufferedReader in=new BufferedReader(new FileReader("F://»º´æÇø//test.csv"));
			s1=in.readLine();
			while((s1=in.readLine())!=null)
			{
				System.out.println(s1);
				if(s1.charAt(s1.length()-1)=='"')
				{
					//break;
					continue;
				}
			}
			in.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
