package sy_2;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
class Sporter
{
	private String subject;
	private String name;
	private int[] num=new int[10000];
	private double degree;
	
	protected String getSubject() {
		return subject;
	}
	protected void setSubject(String subject) {
		this.subject = subject;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getNum(int i)
	{
		return this.num[i];
	}
	protected void setNum(int i,int num)
	{
		this.num[i]=num;
	}
	public double getDegree() {
		return degree;
	}
	public void setDegree(int num_of_judgement) {
		double degree = 0;
		Arrays.sort(num,1,num_of_judgement+1);
		for(int i=2;i<num_of_judgement;i++)
		{
			degree+=num[i];
		}
		degree/=(num_of_judgement-2);
		this.degree = degree;
	}

}
public class App_cp {

	public static void main(String[] args) throws IOException {
		Scanner cin=new Scanner(System.in);
		int n=-1;
		int m=-1;
		System.out.println("��������е�����:");
		try
		{
			n=cin.nextInt();
			if(n<3)
				throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("����̫��!"+e+"���׳�");
			e.printStackTrace();
		}
		
		
		System.out.println("�������˶�Ա����:");
		m=cin.nextInt();
		FileReader fin=new FileReader("F:\\onedrive\\�ҵĴ���\\javawork\\javaʵ��\\src\\sy_2\\test.txt");
		BufferedReader bin=new BufferedReader(fin);
		FileWriter fout=new FileWriter("F:\\onedrive\\�ҵĴ���\\javawork\\javaʵ��\\src\\sy_2\\out.txt");
		BufferedWriter bout=new BufferedWriter(fout);
		
		for(int i=1;i<=m;i++)
		{
			Sporter ans=new Sporter();
			String s=null;
			if((s=bin.readLine())!=null)
			{
				String ss[]=null;
				ss=s.split(" ");
				ans.setName(ss[0]);
				ans.setSubject(ss[1]);
			}
			for(int j=1;j<=n;j++)
			{	
				System.out.println("�����"+j+"Ϊ"+ans.getName()+"�μӵ�"+ans.getSubject()+"��Ŀ���(1-10):");
				int nn=cin.nextInt();
				ans.setNum(j,nn);
			}
			ans.setDegree(n);
			String sss=String.valueOf(ans.getDegree());
			bout.write(ans.getName());
			bout.write("        ");
			bout.write(ans.getSubject());
			bout.write("        ");
			bout.write(sss);
			bout.newLine();
			bout.flush();
		}
		bout.close();
		cin.close();
		bin.close();
	}

}
