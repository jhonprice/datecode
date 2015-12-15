package homework;
import java.util.*;
public class Employee {
	private String name;
	private int age;
	private String sex;
	private String position;
	private int salary;
	public Employee (String name,int age,String sex,String position,int salary){
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setPosition(position);
		this.setSalary(salary);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Employee employee1=new Employee("方若宇",20,"男","学生",5000);
		Employee employee2=new Employee("张三",25,"男","HR",3000);
		Employee employee3=new Employee("李四",30,"男","项目经理",10000);
		TreeMap<String,Employee>treemap=new TreeMap<String,Employee>();
		treemap.put(employee1.getName(),employee1);
		treemap.put(employee2.getName(),employee2);
		treemap.put(employee3.getName(),employee3);
		System.out.println("由TreeMap实现的Map集合：");
		Iterator<String>it=treemap.keySet().iterator();
		while(it.hasNext())
		{
			Employee ee=(Employee)treemap.get(it.next());
			System.out.println(ee.getName()+"  "+ee.getSex()+"  "+ee.getAge()+"  "+ee.getPosition()+"  "+ee.getSalary());
		}
	}

}