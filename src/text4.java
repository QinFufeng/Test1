
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
		// TODO �Զ����ɵĹ��캯�����
		container=this.getContentPane();
		Button1=new JButton("�˳�");
		this.setTitle("��ӭ����ͼ�����ϵͳ");
		container.setLayout(new FlowLayout());
		container.add(Button1);
		container.setBackground(Color.BLUE);
		Button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// TODO �Զ����ɵķ������
				
			}
		});
		
		this.setVisible(true);
		this.setSize(550,550);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new text4();
	}

}
