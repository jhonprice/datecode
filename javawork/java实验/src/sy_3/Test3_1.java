package sy_3;
import java.util.ArrayList;
class Students
{
	private int sID;
	private String name;
	private String dept;
	public Students(int sID,String name,String dept)
	{
		this.sID=sID;
		this.setName(name);
		this.setDept(dept);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
public class Test3_1 {

	public static void main(String[] args) {
		 ArrayList<Students> studentList=new ArrayList<Students>();
		 Students s1=new Students(11,"jackdaw","dzxxxy");
		 Students s2=new Students(12,"lscc","dzxxxy");
		 Students s3=new Students(13,"yxqqq","dzxxxy");
		 studentList.add(s1);
		 studentList.add(s2);
		 studentList.add(s3);
		 System.out.println(studentList.size());
		 for(int i=0;i<studentList.size();i++)
		 {
			 System.out.println(studentList.get(i).getDept()+"    "+studentList.get(i).getName());
		 }
		 System.out.println("----------");
		 studentList.add(1,new Students(15,"ÕÅÈý","dzxxxy"));
		 for(int i=0;i<studentList.size();i++)
		 {
			 System.out.println(studentList.get(i).getDept()+"    "+studentList.get(i).getName());
		 }
	}

}
