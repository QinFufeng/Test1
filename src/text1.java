
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
	button1=new JButton("命令按钮1");
	button2=new JButton("命令按钮2");
	button3=new JButton("命令按钮3");
	button4=new JButton("命令按钮4");
	button5=new JButton("命令按钮5");
	button6=new JButton("命令按钮6");
	button7=new JButton("命令按钮7");
	button8=new JButton("命令按钮8");
	button9=new JButton("命令按钮9");
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
		// TODO 自动生成的方法存根
		new GridlayyoutDemo();
	}

}
