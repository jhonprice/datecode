package book;

public class GenericsClassDeTest <T> {

	private T mvar;
	public void set(T mvar)
	{
		this.mvar=mvar;
	}
	public T get()
	{
		return mvar;
	}
	public static void main(String[] args) {
		GenericsClassDeTest<Integer> gcdtl=new GenericsClassDeTest<Integer>();
		gcdtl.set(new Integer(10));
		System.out.println("Integer: "+gcdtl.get());
		GenericsClassDeTest<String> gcdt2=new GenericsClassDeTest<String>();
		gcdt2.set(new String("hello"));
		System.out.println("String : "+gcdt2.get());

	}

}
