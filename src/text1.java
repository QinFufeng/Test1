
import java.awt.*;

import javax.swing.*;
class GridlayyoutDemo extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button1,button2,button3,button4,button5,
	button6,button7,button8,button9;
	public GridlayyoutDemo()
	{
	Container container=this.getContentPane();
	container.setLayout(new GridLayout(3,3,30,25));
	button1=new JButton("���ť1");
	button2=new JButton("���ť2");
	button3=new JButton("���ť3");
	button4=new JButton("���ť4");
	button5=new JButton("���ť5");
	button6=new JButton("���ť6");
	button7=new JButton("���ť7");
	button8=new JButton("���ť8");
	button9=new JButton("���ť9");
	container.add(button1);
	container.add(button2);
	container.add(button3);
	container.add(button4);
	container.add(button5);
	container.add(button6);
	container.add(button7);
	container.add(button8);
	container.add(button9);
	this.setVisible(true);
	this.setSize(400, 200);
	}
	}
public class text1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new GridlayyoutDemo();
	}

}
