package book;

public class BreakLableTest {

	public static void main(String[] args) {
		outer:for(int i=0;i<3;i++)
		{
			inner:for(int j=0;j<3;j++)
			{
				if(j>1)
					break inner;
				System.out.println(j+" and "+i);
			}
		}

	}

}
