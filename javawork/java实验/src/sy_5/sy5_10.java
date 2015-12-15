package sy_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sy5_10 extends JFrame{
	private JTextArea ja;
	private JRadioButtonMenuItem[] fonts;
	private ButtonGroup fontGroup;
	private JCheckBoxMenuItem[] styleItems;
	private JCheckBoxMenuItem RD;
	private int style;
	private JTextArea display;
	////////////////////////////////
	private JMenu stMenu;
	private JMenu syMenu;
	private JMenu fontMenu;
	public sy5_10()
	{
		super("asd");
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);
		
		ItemHandler itemHandler=new ItemHandler();
		
		stMenu=new JMenu("设置");
		syMenu=new JMenu("风格");
		String[] styleNames={"普通","黑体","斜体"};
		styleItems=new JCheckBoxMenuItem[styleNames.length];
		StyleHandler styleHandler=new StyleHandler();
		for(int i=0;i<styleNames.length;i++)
		{
			styleItems[i]=new JCheckBoxMenuItem(styleNames[i]);
			syMenu.add(styleItems[i]);
			styleItems[i].addItemListener(styleHandler);
		}
		stMenu.add(syMenu);
		fontMenu=new JMenu("字体");
		String[] fontNames={"宋体","楷体","黑体"};
		fonts=new JRadioButtonMenuItem[fontNames.length];
		fontGroup=new ButtonGroup();
		for(int i=0;i<fonts.length;i++)
		{
			fonts[i]=new JRadioButtonMenuItem(fontNames[i]);
			fontMenu.add(fonts[i]);
			fontGroup.add(fonts[i]);
			fonts[i].addActionListener(itemHandler);
		}
		fonts[0].setSelected(true);
		stMenu.add(fontMenu);
		stMenu.addSeparator();
		
		rdHandler rdH=new rdHandler();
		String rName="只读";
		RD=new JCheckBoxMenuItem(rName);
		RD.addActionListener(rdH);
		RD.setSelected(false);
		stMenu.add(RD);
		/////////////////////////////////////////
		bar.add(stMenu);
		JMenu opMenu=new JMenu("操作");
		JMenuItem exitItem=new JMenuItem("退出");
		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		opMenu.add(exitItem);
		bar.add(opMenu);
		display=new JTextArea("asdasdas");
		//display.setFont(new Font("宋体",Font.PLAIN,20));
		add(display,BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		sy5_10 frm=new sy5_10();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class ItemHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			for(int i=0;i<fonts.length;i++)
			{
				if(e.getSource()==fonts[i])
				{
					display.setFont(new Font(fonts[i].getText(),style,20));
					break;
				}
			}
		}
	}
	private class StyleHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			style=0;
			if(styleItems[0].isSelected());
			if(styleItems[1].isSelected())
				style+=Font.BOLD;
			if(styleItems[2].isSelected())
				style+=Font.ITALIC;
			display.setFont(new Font(display.getFont().getName(),style,20));
			
		}
	}
	private class rdHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==RD)
			{
				display.setEnabled(false);
				syMenu.setEnabled(false);
				fontMenu.setEnabled(false);
				if(RD.isSelected()==false)
				{	
					display.setEnabled(true);
					syMenu.setEnabled(true);
					fontMenu.setEnabled(true);
				}
			}	
		}
	}

}
