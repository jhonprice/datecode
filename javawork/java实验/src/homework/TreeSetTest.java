package homework;
import java.util.*;
public class TreeSetTest {

	public static void main(String[] args) {
		 Set<String> tset=new TreeSet<String>();
		 String s1="horse";
		 String s2="cat";
		 String s3="zoo";
		 String s4="fish";
		 String s5="bird";
		 tset.add(s1);//1
		 tset.add(s2);//2
		 tset.add(s3);//3
		 tset.add(s4);//4
		 tset.add(s5);//5
		 System.out.println("TreeSet集合中的元素为：");
		 Iterator<String> it1=tset.iterator();
		 while(it1.hasNext())
		 {
			String s=it1.next();
			System.out.println(s);
		 }
	}

}

