package sy_2;
import java.io.*;

public class ShowFile {

	public static void main(String[] args) throws IOException 
	{
		int i;
		FileInputStream fin;
		fin=new FileInputStream("D://onedrive//我的代码/javawork//java实验//src//sy_2//myfile");
		do
		{
			i=fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);
		fin.close();

	}

}
