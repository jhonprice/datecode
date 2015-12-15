package sy_2;

import java.io.*;
public class WriteFile {

	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw=new FileWriter("D:/onedrive/我的代码/javawork/java实验/src/sy_2/test");
		String str1 = "上海电机学院";
		String str2 = "欢迎使用java ";
		fw.write(str1);
		fw.write(str2);
		fw.close();
		System.out.println("Write done");
	}

}
