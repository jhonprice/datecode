package sy_2;

import java.io.*;
public class WriteFile {

	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw=new FileWriter("D:/onedrive/�ҵĴ���/javawork/javaʵ��/src/sy_2/test");
		String str1 = "�Ϻ����ѧԺ";
		String str2 = "��ӭʹ��java ";
		fw.write(str1);
		fw.write(str2);
		fw.close();
		System.out.println("Write done");
	}

}
