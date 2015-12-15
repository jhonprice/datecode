package homework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetTest {

	public static void main(String[] args) {
		 Set<String> hset=new HashSet<String>();
		 String s1="horse";
		 String s2="cat";
		 String s3="zoo";
		 String s4="fish";
		 String s5="bird";
		 hset.add(s1);//1
		 hset.add(s2);//2
		 hset.add(s3);//3
		 hset.add(s4);//4
		 hset.add(s5);//5
		 System.out.println("HashSet集合中的元素为：");
		 Iterator<String> it1=hset.iterator();
		 while(it1.hasNext())
		 {
			String s=it1.next();
			System.out.println(s);
		 }
	}

}
