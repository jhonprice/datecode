package DMHY;

import java.util.*;
import java.io.*;

public class sy1 {

	public static void main(String[] args) throws IOException{
		String str=new String();
		String str2=new String();
		File f1=new File("I:\\1.csv");
		File f2=new File("I:\\2.csv");
		FileReader fin=new FileReader(f1);
		FileWriter fout=new FileWriter(f2);
		BufferedReader in=new BufferedReader(fin);
		BufferedWriter out=new BufferedWriter(fout);
		while((str=in.readLine())!=null)
		{
			//System.out.println(str);
			if(str.indexOf("/topics/view/")!=-1)
			{
				System.out.print("\""+str.substring(str.indexOf("/topics/view/"),str.indexOf("html")+4)+"\""+",");
				out.write("\""+str.substring(str.indexOf("/topics/view/"),str.indexOf("html")+4)+"\""+",");
				str=in.readLine();
				System.out.print("\""+str.substring(0,str.indexOf("<")).trim()+"\""+",");
				out.write("\""+str.substring(0,str.indexOf("<")).trim()+"\""+",");
				out.flush();
			}
			if(str.indexOf("-magnet")!=-1)
			{
				int ma=str.indexOf("href");
				str2=str.substring(str.indexOf("\"",ma),str.indexOf(">",ma));
				str2=str2.replace("\"", "");
				if(!str2.equals(""))
					str2=str2.substring(0, str2.indexOf("&"));
				
				System.out.print("\""+str2+"\""+",");
				out.write("\""+str2+"\""+",");
				str=in.readLine();
				System.out.println("\""+str.substring(str.indexOf(">")+1,str.lastIndexOf("<"))+"\"");
				out.write("\""+str.substring(str.indexOf(">")+1,str.lastIndexOf("<"))+"\"");
				out.newLine();
				out.flush();
			}
			
		}
		in.close();

	}

}
