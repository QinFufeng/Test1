import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class J0612 extends JFrame implements ItemListener {
	private JLabel lb1,lb2;
	private JButton b;
	private JCheckBox n1,n2,n3,n4,n5;
	private Container c;
	String str="��ѡ���Ĳ�Ʒ�ǣ�";
	int d1=0,d2=0,d3=0,d4=0,d5=0;
	double q1=18.00,q2=28.00,q3=98.00,q4=8.00,q5=6.00,sum=0;
	public J0612()
	{
		c=this.getContentPane();
		n1=new JCheckBox("�㽶 18.00��");
		n2=new JCheckBox("ƻ�� 28.00��");
		n3=new JCheckBox("ӣ�� 98.00��");
		n4=new JCheckBox("�Ϲ� 8.00��");
		n5=new JCheckBox("���� 6.00��");
		lb1=new JLabel();
		lb2=new JLabel();
		//lb1.setMaximumSize(new Dimension( 150,200));
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		b=new JButton("���빺�ﳵ");
		p1.add(n1);
		//p1.add(q1);
		p1.add(n2);
		p1.add(n3);
		p1.add(n4);
		p1.add(n5);
		p2.add(b);
		p2.add(lb1);
		c.add(lb2, BorderLayout.CENTER);
		b.addActionListener(new tijiao());
		n1.addItemListener(new xuanze());
		n2.addItemListener(new xuanze());
		n3.addItemListener(new xuanze());
		n4.addItemListener(new xuanze());
		n5.addItemListener(new xuanze());
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.SOUTH);
		/*this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});*/
		this.setTitle("���ﳵ����");
		this.setSize(700, 450);
		this.setVisible(true);

	}
	class xuanze implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			if((JCheckBox)e.getItem()==n1)
			{
				if(e.getStateChange()==e.SELECTED)
				{
					str+="�㽶, ";
					lb2.setText(str);
					sum+=q1;
				}
				else
				{
					String s="�㽶, ";
					str=str.replace(s, "");
					lb2.setText(str);
					sum-=q1;
				}
			}
			if((JCheckBox)e.getItem()==n2)
			{
				if(e.getStateChange()==e.SELECTED)
				{
					str+="ƻ��, ";
					lb2.setText(str);
					sum+=q2;
				}
				else
				{
					String s="ƻ��, ";
					str=str.replace(s, "");
					lb2.setText(str);
					sum-=q2;
				}
			}
			if((JCheckBox)e.getItem()==n3)
			{
				if(e.getStateChange()==e.SELECTED)
				{
					str+="ӣ��, ";
					lb2.setText(str);
					sum+=q3;
				}
				else
				{
					String s="ӣ��, ";
					str=str.replace(s, "");
					lb2.setText(str);
					sum-=q3;
				}
			}
			if((JCheckBox)e.getItem()==n4)
			{
				if(e.getStateChange()==e.SELECTED)
				{
					str+="�Ϲ�, ";
					lb2.setText(str);
					sum+=q4;
				}
				else
				{
					String s="�Ϲ�, ";
					str=str.replace(s, "");
					lb2.setText(str);
					sum-=q4;
				}
			}
			if((JCheckBox)e.getItem()==n5)
			{
				if(e.getStateChange()==e.SELECTED)
				{
					str+="����, ";
					lb2.setText(str);
					sum+=q5;
				}
				else
				{
					String s="����, ";
					str=str.replace(s, "");
					lb2.setText(str);
					sum-=q5;
				}
			}
		}
	
	}
	class tijiao implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			System.out.print(str+sum);
			lb1.setText("��һ����Ҫ��"+sum+"��");
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new J0612();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	
}
