package sy_3;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class StudentFrame extends Frame implements ActionListener{
	TextArea showArea;
	TextField inputName,inputScore;
	Button button;
	TreeSet treeSet;
	StudentFrame()
	{
		treeSet=new TreeSet();///
		showArea=new TextArea();
		inputName=new TextField(5);
		inputScore=new TextField(5);
		button=new Button("确定");
		button.addActionListener(this);
		Panel pNorth=new Panel();
		pNorth.add(new Label("Name:"));
		pNorth.add(inputName);
		pNorth.add(inputScore);
		pNorth.add(button);
		add(pNorth,BorderLayout.NORTH);
		add(showArea,BorderLayout.CENTER);
		setSize(300,320);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		validate();
	}
	public void actionPerformed(ActionEvent e)
	{
		String name=inputName.getText();
		int score=0;
		try
		{
			score=Integer.parseInt(inputScore.getText().trim());
			if(name.length()>0)
			{
				Student stu=new Student(name,score);
				treeSet.add(stu);////
				show(treeSet);
			}
		}
		catch(NumberFormatException exp)
		{
			inputScore.setText("请输入数字字符");
		}
		
	}
	public void show(TreeSet tree)
	{
		showArea.setText(null);
		Iterator te=tree.iterator();
		while(te.hasNext())
		{
			Student stu=(Student)te.next();
			showArea.append("Name:"+stu.getName()+"Score:"+stu.getScore()+"\n");
		}
	}


}
