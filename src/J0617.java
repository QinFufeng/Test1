import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class J0617 extends JFrame {
	JComboBox y;
	JLabel l;
	JButton b;
	JTextField t1,t2;
	double s=0.00;
	Container c;
	JPanel p;
	public J0617()
	{
		c=this.getContentPane();
		l=new JLabel();
		//l.Text=s.ToString();
		y=new JComboBox();
		y.addItem("           ");
		y.addItem("+");
		y.addItem("-");
		y.addItem("*");
		y.addItem("/");
		b=new JButton("计算");
		t1=new JTextField(15);
		t2=new JTextField(15);
		p=new JPanel();
		p.add(t1);
		p.add(y);
		p.add(t2);
		p.add(b);
		p.add(l);
		b.addActionListener(new jisuan());
		//l.setText(""+s);
		this.add(p);
		this.setSize(700, 300);
		this.setTitle("计算器");
		this.setVisible(true);
	}
	class jisuan implements ActionListener
	{
		private JFrame newFrame;

		public void actionPerformed(ActionEvent e)
		{
			//l.setText(""+s);
			try
			{
				double a1,a2;
				a1=Double.parseDouble(t1.getText());
				a2=Double.parseDouble(t2.getText());
				if(y.getSelectedItem()=="+")
				{
					//if(e.getStateChange()==ItemEvent.SELECTED)
					//{
					    s=a1+a2;
				        l.setText(""+s);
				    //}
				}
				if(y.getSelectedItem()=="-")
				{
					    s=a1-a2;
				        l.setText(""+s);
				}
				if(y.getSelectedItem()=="*")
				{
					    s=a1*a2;
				        l.setText(""+s);
				}
				if(y.getSelectedItem()=="/")
				{
					    s=a1/a2;
				        l.setText(""+s);
				}
			}
			catch (ArrayIndexOutOfBoundsException ee)
			{
				JOptionPane.showMessageDialog(newFrame.getContentPane(),
						"弹出的是错误提示框!", "系统信息", JOptionPane.ERROR_MESSAGE); 
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new J0617();
	}

}
