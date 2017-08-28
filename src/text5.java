
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class text5 extends JFrame {
    private	JLabel label1,label2,label3,label4,label5;
    private JTextField t1,t2;
	private Container container;
	public  text5(){
		container=this.getContentPane();
		label1=new JLabel("x:");
		label2=new JLabel();
		label3=new JLabel("     y:");
		label4=new JLabel();
		label5=new JLabel();
		t1=new JTextField(10);
		t2=new JTextField(10);
		container.setLayout(new FlowLayout());
		container.add(label1);
		container.add(label2);
		container.add(label3);
		container.add(label4);
		container.add(label5);
		this.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				int  s=(int)e.getKeyChar();
				if(s==27)System.exit(0);
				label5.setText("   按下键："+(char)s);
			}
		});
		this.addMouseMotionListener(new MouseMotionLis());
		this.setTitle("鼠标检测");
		this.setSize(400, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new text5();
	}
	class MouseMotionLis extends MouseMotionAdapter
		{
			
			public void mouseMoved(MouseEvent e)
			{
				int k=e.getX();
				label2.setText(" "+k);
				int y=e.getY();
				label4.setText(y+"");
			}
		}

}
