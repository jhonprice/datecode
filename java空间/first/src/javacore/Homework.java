package javacore;

import java.util.*;
interface Shape
{
	public abstract double area();  
}
class Circle implements Shape
{
	private double r=2;
	public Circle(double r)
	{
		this.r=r;
	}
	public double area()
	{
		return 2*r*r;
	}
	
}
class Triangle implements Shape
{
	private double d=2;
	private double h=2;
	public Triangle(double d,double h)
	{
		this.d=d;
		this.h=h;
	}
	public double area()
	{
		return 0.5*d*h;
	}

}
class Rectangle implements Shape
{
	private double a=2;
	private double b=2;
	public Rectangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double area()
	{
		return a*b;
	}
}
class Square implements Shape
{
	private double a=3;
	public Square(double a)
	{
		this.a=a;
	}
	public double area()
	{
		return a*a;
	}
}
public class Homework {

	public void s_out(List<? extends Shape> c)
	{
		double ans=c.get(0).area();
		System.out.println(c.get(0).getClass().getName()+" : "+ans);
	}
	public static void main(String[] args) {
		Homework sl=new Homework();
		List<Circle> sc=new ArrayList<Circle>();
		List<Triangle> st=new ArrayList<Triangle>();
		List<Rectangle> sr=new ArrayList<Rectangle>();
		List<Square> ss=new ArrayList<Square>();
		sc.add(new Circle(5));
		st.add(new Triangle(4,6));
		sr.add(new Rectangle(7,6));
		ss.add(new Square(9));
		sl.s_out(sc);
		sl.s_out(st);
		sl.s_out(sr);
		sl.s_out(ss);
		
	}

}
