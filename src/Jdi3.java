import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jdi3 extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton button1;
	private Container container;
	public Jdi3()
	{
		this.setTitle("欢迎使用图书管理系统 ");
		container=this.getContentPane();
		container.setLayout(new FlowLayout());
		button1=new JButton("退出");
		button1.addActionListener(new Buttonevent());
		container.add(button1);
		container.setBackground(Color.BLUE);
		this.setVisible(true);
		this.setSize(500, 500);
	}
	class Buttonevent implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Jdi3();		
	}
}

