package se_work;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import se_work.fileAC;

public class Fr extends JFrame{
	static JLabel ll1=new JLabel("选手及项目");
	static JTextArea tt1=new JTextArea("Please Start");
	static JLabel l1=new JLabel("1号裁判分数"); 
	static JTextField t1=new JTextField(5);
	static JLabel l2=new JLabel("2号裁判分数"); 
	static JTextField t2=new JTextField(5);
	static JLabel l3=new JLabel("3号裁判分数");
	static JTextField t3=new JTextField(5);
	static JLabel l4=new JLabel("4号裁判分数");
	static JTextField t4=new JTextField(5);
	static JTextField t5=new JTextField(10);
	static JLabel l5=new JLabel("最后得分");
	static JButton b2=new JButton("sumbit");
	static JMenuBar bar=new JMenuBar();
	static JMenu fileMenu=new JMenu("文件");
	static JMenu optionMenu=new JMenu("操作");
	static JMenuItem exitItem=new JMenuItem("退出");
	static JMenuItem fileItem=new JMenuItem("文件");
	JScrollPane jsp=new JScrollPane(tt1);
	public Fr()
	{
		super("hahaha");
		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		//jsp.setBounds(20, 70, 220,100);
		fileMenu.add(fileItem);
		fileItem.addActionListener(new fileAC());
		optionMenu.add(exitItem);
		bar.add(fileMenu);
		bar.add(optionMenu);
		setJMenuBar(bar);
		setLayout(null);
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		tt1.setEditable(false);
		t5.setEditable(false);
		b2.setEnabled(false);
		add(l1);add(t1);add(l2);add(t2);add(l3);
  	    add(t3);add(l4);add(t4);add(t5);add(l5);
  	    add(b2);add(ll1);add(jsp);
  	    b2.addActionListener(new SU());
  	    ll1.setBounds(20,180,100,20);
  	    jsp.setBounds(100,180,200,150);
  	    l1.setBounds(20,20,100,20);
		t1.setBounds(100,20,60,20);
		l2.setBounds(20,60,100,20);
		t2.setBounds(100,60,60,20);
		l3.setBounds(20,100,100,20);
		t3.setBounds(100,100,60,20);
		l4.setBounds(20,140,100,20);
		t4.setBounds(100,140,60,20);
		t5.setBounds(200,40,100,30);
		l5.setBounds(200,75,100,20);
		b2.setBounds(200,100,100,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,400);
		setVisible(true);
	}	
}