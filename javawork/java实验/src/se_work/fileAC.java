package se_work;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;
import java.io.*;

public class fileAC implements ActionListener{

	private JFileChooser jfc=new JFileChooser(new File("."));
	File file1;
	public void actionPerformed(ActionEvent e) 
	{
		JMenuItem jmi=(JMenuItem)e.getSource();
		if(jmi==Fr.fileItem)
		{
			int status=jfc.showOpenDialog(Fr.fileItem);
			if(status!=JFileChooser.APPROVE_OPTION)
			{
				return;
			}
			jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
			file1=jfc.getSelectedFile();
			datahome.F=file1;
			
			try {
				Fr.t1.setEditable(true);
				Fr.t2.setEditable(true);
				Fr.t3.setEditable(true);
				Fr.t4.setEditable(true);
				Fr.tt1.setEditable(true);
				Fr.t5.setEditable(true);
				Fr.b2.setEnabled(true);
				Fr.tt1.setText("为下面打分\n");
				Scanner scan=new Scanner(datahome.F);
				String info="";
				int i=0;
				while(scan.hasNextLine())
				{
					i++;
					info=scan.nextLine();
					Fr.tt1.append("No."+i+"   "+info+"\n");
				}
				datahome.I=i;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	}
}
