package sy_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menuplus extends JFrame {
	private JMenu fontMenu,styleMenu,setMenu;
	///////////////////////////////////
	private JRadioButtonMenuItem[] fonts;
	private JCheckBoxMenuItem[] styles;
	private JCheckBoxMenuItem read;
	private ButtonGroup fontGroup;
	private JTextArea display;
	private int style;
	public Menuplus() {
		super("菜单应用程序");
		setMenu=new JMenu("设置");
		JMenu operationMenu=new JMenu("操作");
		
		String[] fontNames={"宋体","楷体","黑体"};
		fontMenu=new JMenu("字体");
		fonts=new JRadioButtonMenuItem[fontNames.length];
		fontGroup=new ButtonGroup();
		ItemHandler itemHandler=new ItemHandler();   //创建菜单内部类
		for(int count=0;count<fonts.length;count++)
		{
			fonts[count]=new JRadioButtonMenuItem(fontNames[count]);
			fontMenu.add(fonts[count]);
			fontGroup.add(fonts[count]);
			fonts[count].addActionListener(itemHandler);
		}
		fonts[0].setSelected(true);
		setMenu.add(fontMenu);
		setMenu.addSeparator();
		String[] styleNames={"普通","黑体","斜体"};
		styleMenu=new JMenu("风格");
		styles=new JCheckBoxMenuItem[styleNames.length];
		StyleHandler styleHandler=new StyleHandler(); 
		for(int count=0;count<styles.length;count++)
		{
			styles[count]=new JCheckBoxMenuItem(styleNames[count]);
			styleMenu.add(styles[count]);
			styles[count].addItemListener(styleHandler);
		}
		setMenu.add(styleMenu);
		setMenu.addSeparator();
		String readName="只读";
		read=new JCheckBoxMenuItem(readName);   
		ReadHandler readHandler=new ReadHandler();    
		read.addActionListener(readHandler);
		setMenu.add(read);
		JMenuBar bar=new JMenuBar();
	    setJMenuBar(bar);
		bar.add(setMenu);
		bar.add(operationMenu);
		display=new JTextArea("我是一个文本框，请进行操作：");
		display.setFont(new Font("宋体",Font.PLAIN,20));
		add(display,BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
		
		JMenuItem exitItem=new JMenuItem("退出");
		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{ System.exit(0);}
		});
		operationMenu.add(exitItem);	
	}
	public static void main(String[] args) {
		Menuplus frm=new Menuplus();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class ItemHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for(int count=0;count<fonts.length;count++) 
		      if(e.getSource()==fonts[count]) {
		      	display.setFont(new Font(fonts[count].getText(),style,20));
		      	break;
		      }	
		}
		
	}
	private class StyleHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			style=0;
			if(styles[0].isSelected());
			if(styles[1].isSelected())
				style+=Font.BOLD;
			if(styles[2].isSelected())
				style+=Font.ITALIC;
			display.setFont(new Font(display.getFont().getName(),style,20));	
		}  
	}
		private class ReadHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==read) {
				display.setEnabled(false);
				fontMenu.setEnabled(false);
				styleMenu.setEnabled(false);
				if(read.isSelected()==false)	{	
					display.setEnabled(true);
					fontMenu.setEnabled(true);
			     	styleMenu.setEnabled(true);
				}
			}	
		}
	}
}
