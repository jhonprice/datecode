package bigdata;

class numwash
{
	static String washer(String s1)
	{
		s1.replaceAll("��", "a");
		s1.replaceAll("��", "0");
		return s1;
	}
}
public class test4 {

	public static void main(String[] args) {
		String s="123��567.213";
		s.replaceAll("��", "a");
		System.out.println(s.replaceAll("��", ""));

	}

}
