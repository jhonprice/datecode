package sy_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class sy5_8 extends JFrame implements ItemListener,ChangeListener{

	private JTextArea ta=new JTextArea(3,2);
	private JCheckBox[] jc=new JCheckBox[2];
	private JSlider[] js=new JSlider[3];
	private JPanel pan=new JPanel();
	GridLayout grid =new GridLayout(4,1);
	private int r=0,g=0,b=0;
	public sy5_8(String s)
	{
		super(s);
		pan.setLayout(grid);
		jc[0]=new JCheckBox("Ç°¾°É«",false);
		jc[1]=new JCheckBox("±³¾°É«",false);
		jc[0].addItemListener(this);
		jc[1].addItemListener(this);
		for(int i=0;i<3;i++)
		{
			js[i]=new JSlider(0,255,0);
			js[i].setMajorTickSpacing(25);
			js[i].setMinorTickSpacing(5);
			js[i].setPaintTicks(true);
			js[i].setPaintLabels(true);
			js[i].addChangeListener(this);
			pan.add(js[i]);
		}
		add(ta,BorderLayout.CENTER);
		
		add(jc[0],BorderLayout.EAST);
		add(jc[1],BorderLayout.WEST);
		add(pan,BorderLayout.SOUTH);
		setSize(1240,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		sy5_8 frm=new sy5_8("asdasd");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChange()==1)
			ta.setBackground(new Color(r,g,b));
		if(e.getStateChange()==2)
			ta.setBackground(new Color(r,g,b));
	}
	public void stateChanged(ChangeEvent e)
	{
		r=js[0].getValue();
		g=js[1].getValue();
		b=js[2].getValue();
		
	}

}
