package sy_2;

import java.io.*;
public class File6 {

	public static void main(String[] args) throws IOException 
	{
		File target=new File("a.txt");
		if(!target.exists())
			System.out.println("�ļ�������");
		else
			if(target.delete())
				System.out.println("�ļ���ɾ��");
			else
				System.out.println("�ļ�����ɾ��");

	}

}
