
import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
class BorderLayoutDemo extends JFrame
{
	private JButton button1,button2,button3,button4,button5,button6;
	private Box boxv,boxh;
	public BorderLayoutDemo()
	{
		this.setTitle("welcome£¡");
		Container container=this.getContentPane();
		container.setLayout(new BorderLayout());
		boxv=Box.createVerticalBox();
		button1=new JButton("A");
		button2=new JButton("B");
		button3=new JButton("C");
		boxv.add(button1);
		boxv.add(button2);
		boxv.add(button3);
		container.add(boxv,BorderLayout.NORTH);
		boxh=new Box(BoxLayout.X_AXIS);
		button4=new JButton("D");
		button5=new JButton("E");
		button6=new JButton("f");
		boxh.add(button4);
		boxh.add(button5);
		boxh.add(button6);
		container.add(boxh,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setSize(400, 200);
	}
}
public class J052702 {

	public static void main(String[] args) {
		new  BorderLayoutDemo();

	}

}