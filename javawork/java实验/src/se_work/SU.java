package se_work;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collections;

public class SU implements ActionListener 
{
	public void actionPerformed(ActionEvent arg0)
	{
		ArrayList<Double> num=new ArrayList<Double>();
		String s=null;
		double d;
		s=Fr.t1.getText();
		if(s.isEmpty())
			s="-100000";
		d=Double.parseDouble(s);
		num.add(d);
		s=Fr.t2.getText();
		if(s.isEmpty())
			s="-100000";
		d=Double.parseDouble(s);
		num.add(d);
		s=Fr.t3.getText();
		if(s.isEmpty())
			s="-100000";
		d=Double.parseDouble(s);
		num.add(d);
		s=Fr.t4.getText();
		if(s.isEmpty())
			s="-100000";
		d=Double.parseDouble(s);
		num.add(d);
		Collections.sort(num);
		d=(num.get(1)+num.get(2))/2;
		Fr.t1.setText("");
		Fr.t2.setText("");
		Fr.t3.setText("");
		Fr.t4.setText("");
		Fr.t5.setText(String.valueOf(d));
		FileWriter fout = null;
		try {
			fout = new FileWriter(datahome.F2,true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fout.write(Fr.t5.getText()+System.getProperty("line.separator"));
			fout.flush();
			fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datahome.I--;
		if(datahome.I==0)
		{
			Fr.t5.setEditable(false);
			Fr.b2.setEnabled(false);
			return;
		}
	}
	
}
