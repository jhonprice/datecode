package javacore;

import java.io.*;
class Student implements Serializable
{

	private static final long serialVersionUID = 334L;
	String name;
	int age;
	public Student(String a,int b)
	{
		this.name=a;
		this.age=b;
	}
	public String toString()
	{
		return name+"\t"+age;
		
	}
}
public class Test1 {

	public static void main(String[] args) {
		Student stu=new Student("FangRuoyu",20);
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\student.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(stu);
			oos.close();
			FileInputStream fis=new FileInputStream("D:\\student.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			System.out.println((Student)ois.readObject());
			ois.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}
}
