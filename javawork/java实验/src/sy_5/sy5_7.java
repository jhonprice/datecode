package sy_5;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class sy5_7 extends JFrame implements ListSelectionListener{

	private JList list;
	private JTextArea ta=new JTextArea(3,2);

	private String[] sc={"date structure","java","operation system","software engineer","algorithm design"};
	private String[] si={"this is ds","this is java","this is os","this is se","this is ad"};
	public sy5_7(String s)
	{
		super(s);
		list=new JList(sc);
		JScrollPane ps=new JScrollPane(list);
		list.addListSelectionListener(this);
		add(ps,BorderLayout.CENTER);
		add(ta,BorderLayout.NORTH);
		setSize(300,230);
		setVisible(true);
	}
	public static void main(String[] args) {
		sy5_7 frm=new sy5_7("asdasd");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void valueChanged(ListSelectionEvent e)
	{
		JList lt=(JList)e.getSource();
		String lr=(String)lt.getSelectedValue();
		for(int i=0;i<5;i++)
		{
			if(lr.equals(sc[i]))
			{
				ta.setText(si[i]);
				break;
			}
		}
	}

}
