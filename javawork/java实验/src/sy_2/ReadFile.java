package sy_2;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException 
	{
		byte[] c=new byte[1000];
		FileInputStream fr;
		fr=new FileInputStream("D:/onedrive/我的代码/javawork/java实验/src/sy_2/myfile");
		int num=fr.read(c);
		String str=new String(c,0,num);
		System.out.println("字符串长度为 "+num+",如下： ");
		System.out.println(str);
		fr.close();

	}

}
