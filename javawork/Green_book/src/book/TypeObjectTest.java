package book;

public class TypeObjectTest {

	private Object to;
	public void setTo(Object to)
	{
		this.to=to;
	}
	public Object getTo()
	{
		return to;
	}
	public static void main(String[] args) {
		TypeObjectTest tot=new TypeObjectTest();
		tot.setTo(new Integer(8));
		System.out.println(tot.getTo());
		tot.setTo(new String("hello"));
		System.out.println(tot.getTo());

	}

}
