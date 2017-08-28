
import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
class CardLayoutDemo extends JFrame {
	CardLayout mycard;
	void delay()
	{
		for(long i=0;i<200000000;i++)
		{}
	}
	public CardLayoutDemo()
	{
		
		this.setTitle("Í¼Æ¬ä¯ÀÀÆ÷");
		Container container=this.getContentPane();
		JLabel  b1=new JLabel();
		b1.setIcon(new ImageIcon("D:\\25ñû¸¦·æ\\Í¼Æ¬\\h01.jpg"));
		b1.setHorizontalTextPosition(JLabel.CENTER);
		JLabel  b2=new JLabel();
		b2.setIcon(new ImageIcon("D:\\25ñû¸¦·æ\\Í¼Æ¬\\h02.jpg"));
		b2.setHorizontalTextPosition(JLabel.CENTER);
		JLabel  b3=new JLabel();
		b3.setIcon(new ImageIcon("D:\\25ñû¸¦·æ\\Í¼Æ¬\\h03.jpg"));
		b3.setHorizontalTextPosition(JLabel.CENTER);
		JLabel  b4=new JLabel();
		b4.setIcon(new ImageIcon("D:\\25ñû¸¦·æ\\Í¼Æ¬\\h04.jpg"));
		b4.setHorizontalTextPosition(JLabel.CENTER);
		JLabel  b5=new JLabel();
		b5.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\02Î¤¸»³Ç\\Í¼Æ¬\\h8.jpg"));
		b5.setHorizontalTextPosition(JLabel.CENTER);
		mycard=new CardLayout();
		container.setLayout(mycard);
		container.add(b1);
        container.add(b2);
		container.add(b3);
		container.add(b4);
		container.add(b5);
		this.setVisible(true);
		this.setSize(600, 450);
		while(true)
		{
			mycard.next(container);
			delay();
			
		}
	}
}
public class text3{
public static void main(String[] args) {
		new CardLayoutDemo();

	}
}