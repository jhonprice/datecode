package first;

import java.util.*;

public class Employee
{
	private String name=new String();	
	private int age;
	private int salary;
	
	void setDate() throws Exception
	{ 
  	
		Scanner reader=new Scanner(System.in);
  		System.out.println("����������");
  		name=reader.nextLine();
  		System.out.println("����������");
  		age=reader.nextInt();
  		if(age<16)
  		{
  			reader.close();
  			throw new Exception();		
  		}
  		System.out.println("�����빤��");
  		salary=reader.nextInt();
  		reader.close();
  		
  			
  		
	}
	void show()
	{
		System.out.println("����: "+name+"����: "+age+"����: "+salary  );	
	}
	public static void main(String args[])
	{
		Employee a=new Employee();
		try
		{
			a.setDate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("oh GOD!!!");
		}
		a.show();
	}
}
