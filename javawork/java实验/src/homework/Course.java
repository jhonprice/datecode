package homework;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class Course extends JFrame implements ListSelectionListener{
	private JList list;
	private JTextArea ta=new JTextArea(3,10);
	private String[] coursename={"Java","数据结构","数据库","操作系统","计算机组成"};
	public Course(String s) {
		super(s);
		list=new JList(coursename);
		JScrollPane ps=new JScrollPane(list);
		list.addListSelectionListener(this);
		add(ta,BorderLayout.NORTH);
		add(ps,BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
	    Course frm=new Course("课程介绍");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent e) {
		JList lt=(JList)e.getSource();
		String cou=(String) lt.getSelectedValue();
		if(cou.equals(coursename[0])) {
		  ta.append(coursename[0]);
		  ta.append("\n"); }
		else if(cou.equals(coursename[1]))
		 { ta.append(coursename[1]);
		  ta.append("\n");}
		else if(cou.equals(coursename[2]))
		{  ta.append(coursename[2]);
		  ta.append("\n");}
		else if(cou.equals(coursename[3]))
		 { ta.append(coursename[3]);
		  ta.append("\n");}
		else if(cou.equals(coursename[4]))
		 { ta.append(coursename[4]);
		  ta.append("\n");}
	}
}