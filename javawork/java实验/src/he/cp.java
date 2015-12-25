package he;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class cp extends JFrame implements ActionListener
  {
  	int ma,mi;
  	Double d1,d2,d3,d4;
  
  	static JLabel l1=new JLabel("1号裁判分数"); 
    static JTextField t1=new JTextField(5);
  	static JLabel l2=new JLabel("2号裁判分数"); 
  	static JTextField t2=new JTextField(5);
  	static JLabel l3=new JLabel("3号裁判分数");
  	static JTextField t3=new JTextField(5);
  	static JLabel l4=new JLabel("4号裁判分数");
  	static JTextField t4=new JTextField(5);
  	static JTextField t5=new JTextField(10);
  	
  	static JRadioButton b1=new JRadioButton("最后得分");
  	static JRadioButton b2=new JRadioButton("最差的评委");
  	static JRadioButton b3=new JRadioButton("最好的评委");
  	
  	
 	 
  
  	
  	public static void main(String[] args)
  	{
  	    
     	ButtonGroup group=new ButtonGroup();
  		cp frm=new cp();
  		b1.addActionListener(frm);
    	b2.addActionListener(frm);
  	    b3.addActionListener(frm);
  	    frm.add(l1);
  	    frm.add(t1);
  	    frm.add(l2);
  	    frm.add(t2);
  	    frm.add(l3);
  	    frm.add(t3);
  	    frm.add(l4);
  	    frm.add(t4);
  	    frm.add(t5);
  	    group.add(b1);
        group.add(b2);
  	    group.add(b3);
  	    frm.add(b1);
  	    frm.add(b2);
  	    frm.add(b3);
  		frm.setTitle("裁判系统");
  		//frm.setLayout(new FlowLayout());
  		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		frm.setSize(350,210);
  		frm.setLayout(null);
  		l1.setBounds(20,20,100,20);
  		t1.setBounds(100,20,60,20);
  		l2.setBounds(20,60,100,20);
  		t2.setBounds(100,60,60,20);
  		l3.setBounds(20,100,100,20);
  		t3.setBounds(100,100,60,20);
  		l4.setBounds(20,140,100,20);
  		t4.setBounds(100,140,60,20);
  		t5.setBounds(200,40,100,30);
  		b1.setBounds(200,75,100,20);
  		b2.setBounds(200,100,100,20);
  		b3.setBounds(200,125,100,20);
  		frm.setVisible(true);
  		
  	}
 
  	 public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==b1)
          {
        	ArrayList<Double> num=new ArrayList<Double>();
        	String s=null;
    		double d;
    		s=t1.getText();
    		d=Double.parseDouble(s);
    		num.add(d);
    		s=t2.getText();
    		d=Double.parseDouble(s);
    		num.add(d);
    		s=t3.getText();
    		d=Double.parseDouble(s);
    		num.add(d);
    		s=t4.getText();
    		d=Double.parseDouble(s);
    		num.add(d);
    		Double m1,m2;
    		int n1,n2;
    		m1=num.get(0);
    		n1=0;
    		m2=num.get(0);
    		n2=0;
    		for(int i=1;i<4;i++)
    		{
    			if(m1<num.get(i))
    			{
    				m1=num.get(i);
    				n1=i;
    			}
    			if(m2>num.get(i))
    			{
    				m2=num.get(i);
    				n2=i;
    			}	
    		}
    		ma=n1;
    		mi=n2;
    		Collections.sort(num);
    		d=(num.get(1)+num.get(2))/2;
        	t5.setText(String.valueOf(d));
          }
           if(e.getSource()==b2)
          {
           t5.setText(String.valueOf(mi+1));
           }
           if(e.getSource()==b3)
          {
           t5.setText(String.valueOf(ma+1));
           }
     }
  }
