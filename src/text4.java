
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class text4 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton Button1;
	private Container container;
	public text4() {
		// TODO 自动生成的构造函数存根
		container=this.getContentPane();
		Button1=new JButton("退出");
		this.setTitle("欢迎进入图书管理系统");
		container.setLayout(new FlowLayout());
		container.add(Button1);
		container.setBackground(Color.BLUE);
		Button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// TODO 自动生成的方法存根
				
			}
		});
		
		this.setVisible(true);
		this.setSize(550,550);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new text4();
	}

}
