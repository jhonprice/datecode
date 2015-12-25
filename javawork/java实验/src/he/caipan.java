package he;

import java.io.*;
class Judge
{
	float fens[]=null;
	int size=8;
	public Judge() throws NumberFormatException, IOException
	{
		fens=new float[size];
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		for(int i=0;i<fens.length;i++)
		{
			System.out.print("���"+(i+1)+"λ��ί��֣�");
			fens[i]=Float.parseFloat(br.readLine());
		}
	}
	public float lastFen()
	{
		int minIndex=this.getLowFenIndex();
		int maxIndex=this.getHigFenIndex();
		float allFen=0;
		for(int i=0;i<fens.length;i++)
		{
			if(i!=minIndex&&i!=maxIndex)
			{
				allFen+=fens[i];
			}
		}
		return allFen/(fens.length-2);
	}
	public int getLowFenIndex()
	{
		float minFen=fens[0];
		int minIndex=0;
		for(int i=1;i<fens.length;i++)
		{
			if(minFen>fens[i])
			{
				minFen=fens[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
	public int getHigFenIndex()
	{
		float maxFen=fens[0];
		int maxIndex=0;
		for(int i=1;i<fens.length;i++)
		{
			if(maxFen<fens[i])
			{
				maxFen=fens[i];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	public int worst()
	{
		float lastfen=this.lastFen();
		int index=0;
		float worst=Math.abs(this.fens[0]-lastfen);
		for(int i=1;i<fens.length;i++)
		{
			float worstI=Math.abs(this.fens[i]-lastfen);
			if(worst<worstI)
			{
				worst=worstI;
				index=i;
			}
		}
		return index;
	}
	public int best()
	{
		float lastfen=this.lastFen();
		int index=0;
		float best=Math.abs(this.fens[0]-lastfen);
		for(int i=1;i<fens.length;i++)
		{
			float bestI=Math.abs(this.fens[i]-lastfen);
			if(best>bestI)
			{
				best=bestI;
				index=i;
			}
		}
		return index;
	}
}
public class caipan
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		Judge judge=new Judge ();
		System.out.println("���÷��ǣ�"+judge.lastFen());
		System.out.println("�����߷ֵ���ί��"+(judge.getHigFenIndex()+1)+"����ί");
		System.out.println("�����ͷֵ���ί��"+(judge.getLowFenIndex()+1)+"����ί");
		System.out.println("������ί�ǣ�"+(judge.worst()+1));
		System.out.println("��õ���ί�ǣ�"+(judge.best()+1));
	}
}
