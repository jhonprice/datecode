package sy_3;
import java.util.*;
public class MapStudy {

	public static void main(String[] args) {
		Map<String,String>person=new HashMap<String,String>();
		System.out.println("下面是集合的所有元素");
		person.put("id", "1");
		person.put("name", "ZhangSan");
		person.put("sex", "男");
		person.put("age", "25");
		person.put("love", "java");
		for(Iterator<String>iter=person.keySet().iterator();iter.hasNext();)
		{
			String s=iter.next();
			System.out.println("Key: "+s+"->value: "+person.get(s));
		}
		System.out.println("目前集合的大小为:"+person.size());
		System.out.println("删除的键age的内容为:"+person.get("age"));
		person.remove("age");
		System.out.println("删除操作后,集合的大小为:"+person.size());
	}

}
