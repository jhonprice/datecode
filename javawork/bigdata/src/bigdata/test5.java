package bigdata;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class test5 {

	public static void main(String[] args) throws IOException{
		String s1=new String();
		try
		{
			int I=1;
			BufferedReader in=new BufferedReader(new FileReader("F://������//in.csv"));
			//BufferedWriter ot=new BufferedWriter(new FileWriter("F://������//out.csv"));
			FileOutputStream fos = new FileOutputStream("F://������//out.csv");  
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			PrintWriter pw = new PrintWriter(osw);
			/////////////////////////////////////////////////////////////////////
			pw.println("documentid,property,value");
			s1=in.readLine();
			String no = new String();
			ArrayList<String> ans2=new ArrayList<String>();
			ArrayList<String> ans=new ArrayList<String>();
			while((s1=in.readLine())!=null)
			{
				String s2;
				s2=s1.substring(0);
				//System.out.println(s2+"  asd");
				if(I==1)
				{
					
					no=s1.substring(0,s1.indexOf(","));
					//s1=s1.substring(s1.indexOf(",")+1);
					//System.out.println(s1+"\n");
					//System.out.print(no+"  ");
				}
				else
				{
					int ind=s1.indexOf("Ԫ");
					//System.out.println(ind+"\n");
					while(ind!=-1)
					{
						String s4=s1.substring(0);
						int ind_s=0;
						if(ind==0)
						{
							ind=s1.indexOf("Ԫ",ind+2);
							continue;
						}
						String w=s4.substring(ind-ind_s-1, ind-ind_s);
						if(w.equals("��")||func2(w));
						else
						{
							ind=s1.indexOf("Ԫ",ind+2);
							continue;
						}
						int ed=ind-1;
						int op;
						//System.out.println(ind+"\n");
						while(!func2(w)&&ind-ind_s>1)
						{
							ed--;
							ind_s++;
							w=s4.substring(ind-ind_s-1, ind-ind_s);
						}
						if(ind-ind_s<=1)
						{
							ind=s1.indexOf("Ԫ",ind+2);
							continue;
						}
						op=ed;
						while(func2(w)&&ind-ind_s>1)
						{
							op--;
							ind_s++;
							w=s4.substring(ind-ind_s-1, ind-ind_s);
							//System.out.println(w+" "+ind_s+" "+ind);
							
						}
						if(ind-ind_s<=1)
							op--;
						//System.out.println(s1.substring(op+1,ed+1));
						
						ans2.add(func3(s1.substring(op+1,ed+1)));
						//System.out.println(ans2.get(ans2.size()-1));
						ind=s1.indexOf("Ԫ",ind+2);
					}
					///////////////////////////////////////////
					while((s2.isEmpty())!=true)
					{
						int len=s2.length();
						if(len>10)
						{
							len=10;
						}
						String s3=s2.substring(0, len);
						boolean  f1=func(s3);
						while(len>=2&&f1==false)
						{
							len-=1;
							s3=s3.substring(0,len);
							f1=func(s3);
						}
						//System.out.print(s3+"\\");
						if(len>=2)
						{
							ans.add(s3.substring(0));
							//System.out.print(no+",");
							//System.out.println(ans.get(ans.size()-1)+",");
							//System.out.println(ans2.get(ans2.size()-1));
							//ans2.remove(0);
						}
						s2=s2.substring(s3.length(),s2.length());
					}
					
				}
				I++;
				if(s1.charAt(s1.length()-1)=='"')
				{
					I=1;
					
					//System.out.println(ans2.size()+" "+ans.size());
					//System.out.print(no+",");
					Iterator<String> ian=ans.iterator();
					Iterator<String> ibn=ans2.iterator();
					//System.out.println(ans2.size()+" "+ans.size());	
					while(ian.hasNext()&&ibn.hasNext())
					{
						//System.out.print(no+","+ian.next()+",");
						pw.print(no+","+ian.next()+",");
						//System.out.println(ibn.next());
						String ssss=ibn.next();
						//double d=Double.parseDouble(ssss);
						//BigDecimal b1=new BigDecimal(d);  
						//d=b1.setScale(2,BigDecimal.ROUND_DOWN).doubleValue();  
						pw.println(ssss);
					}
					ans.clear();
					ans2.clear();
					continue;
					//break;
				}
			}
			pw.close();
			in.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

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
	public static boolean func2(String s)
	{
		if(s.equals(".")||s.equals("��"))
			return true;
		else if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9"))
			return true;
		else if(s.equals("��")||s.equals("��")||s.equals("O")||s.equals("o"))
			return true;
		else if(s.equals("һ")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("ʮ")||s.equals("��")||s.equals("ǧ")||s.equals("��"))
			return true;
		else if(s.equals("Ҽ")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("½")||s.equals("��")||s.equals("��")||s.equals("��")||s.equals("ʰ")||s.equals("��")||s.equals("Ǫ")||s.equals("ǧ"))
			return true;
		else
			return false;
		
	}
	public static String func3(String s)
	{
		s=s.replace(" ", "");
		//////////////////////////////////////////
		s=s.replace("��",  "");
		s=s.replace("O",  "0");
		s=s.replace("o",  "0");
		s=s.replace("��", "0");
		s=s.replace("��", "0");
		///////////////////////////////////////////
		s=s.replace("һ", "1");
		s=s.replace("��", "2");
		s=s.replace("��", "3");
		s=s.replace("��", "4");
		s=s.replace("��", "5");
		s=s.replace("��", "6");
		s=s.replace("��", "7");
		s=s.replace("��", "8");
		s=s.replace("��", "9");
		///////////////////////////////////////////
		s=s.replace("Ҽ", "1");
		s=s.replace("��", "2");
		s=s.replace("��", "3");
		s=s.replace("��", "4");
		s=s.replace("��", "5");
		s=s.replace("½", "6");
		s=s.replace("��", "7");
		s=s.replace("��", "8");
		s=s.replace("��", "9");
		//////////////////////////////////////////
		if(s.endsWith("��"))
			s=s+"0000";
		if(s.endsWith("ǧ")||s.endsWith("Ǫ"))
			s=s+"000";
		if(s.endsWith("��")||s.endsWith("��"))
			s=s+"00";
		if(s.endsWith("ʮ")||s.endsWith("ʰ"))
			s=s+"0";
		//////////////////////////////////////////
		s=s.replace("��", "");
		s=s.replace("ǧ", "");
		s=s.replace("Ǫ", "");
		s=s.replace("��", "");
		s=s.replace("��", "");
		s=s.replace("ʮ", "");
		s=s.replace("ʰ", "");
		if(s.endsWith(".00"))
			s=s.substring(0,s.length()-3);
		if(s.endsWith("."))
			s=s.substring(0, s.length()-1);
		if((s.indexOf("."))!=(s.lastIndexOf(".")))
		{
			int i=s.indexOf(".");
			s=s.substring(0,i)+s.substring(i+1);
		}
		return s;
	}

}