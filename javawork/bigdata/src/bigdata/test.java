package bigdata;
import java.util.*;
public class test {

	public static void main(String[] args)
	{
		System.out.println(func3("������ǧ��һʮ��"));
		System.out.println(func3("12121��           1213123.231232"));
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
		return s;
	}

}