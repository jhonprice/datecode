package sy_3;
import java.util.*;
public class MapStudy {

	public static void main(String[] args) {
		Map<String,String>person=new HashMap<String,String>();
		System.out.println("�����Ǽ��ϵ�����Ԫ��");
		person.put("id", "1");
		person.put("name", "ZhangSan");
		person.put("sex", "��");
		person.put("age", "25");
		person.put("love", "java");
		for(Iterator<String>iter=person.keySet().iterator();iter.hasNext();)
		{
			String s=iter.next();
			System.out.println("Key: "+s+"->value: "+person.get(s));
		}
		System.out.println("Ŀǰ���ϵĴ�СΪ:"+person.size());
		System.out.println("ɾ���ļ�age������Ϊ:"+person.get("age"));
		person.remove("age");
		System.out.println("ɾ��������,���ϵĴ�СΪ:"+person.size());
	}

}
