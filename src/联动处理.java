
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class �������� extends JFrame{
	JComboBox combobox1,combobox2;
	Container container;
	String mystr1,mystr2;
	JLabel Label;
	public ��������(){
		container=this.getContentPane();
		combobox1=new JComboBox();
		combobox1.addItem("��ѡ��༶");
		combobox1.addItem("13������1");
		combobox1.addItem("13������2");
		combobox1.addItem("14��1");
		combobox1.addItem("14��2");
		combobox1.addItemListener(new selectedListener());
		
		combobox2=new JComboBox();
		combobox2.addItem("��ѡ������");
		combobox2.addItem("����");
		combobox2.addItem("Ľ��");
		combobox2.addItem("ŷ��");
		combobox2.addItem("�Ϲٳ���");
		combobox2.addItemListener(new selectedListener1());
		
		Label=new JLabel();
		
		JPanel panel;
		panel=new JPanel();
		panel.add(combobox1);
		panel.add(combobox2);
		panel.add(Label);
		
		container.add(BorderLayout.NORTH, panel);
		this.setTitle("��������");
		this.setVisible(true);
		this.setSize(500, 500);
	}
	class selectedListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			String str=(String)combobox1.getSelectedItem();
			if(event.getStateChange()==ItemEvent.SELECTED){
				if(str=="13������1"){
					mystr1="13������1";
				}
				else if(str=="13������2"){
					mystr1="13������2";
				}
				else if(str=="14��2"){
					mystr1="14��2";
				}
				else if(str=="14��1"){
					mystr1="14��1";
				}
			}
		}
	}

	class selectedListener1 implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			String str=(String)combobox2.getSelectedItem();
			if(event.getStateChange()==ItemEvent.SELECTED){
				if(str=="����"){
					mystr2="����";
				}
				else if(str=="Ľ��"){
					mystr2="Ľ��";
				}
				else if(str=="ŷ��"){
					mystr2="ŷ��";
				}
				else if(str=="�Ϲٳ���"){
					mystr2="�Ϲٳ���";
				}
			}
			String L;
			if(mystr1==null||mystr2==null){
				L="������������Ϣ��";
				Label.setText(L);
			}
			if(mystr1!=null&&mystr2!=null){
			L="�༶:"+mystr1+"\0\0\0"+"������"+mystr2;
			Label.setText(L);
			}
			
		}
	}

	public static void main(String[] args) {
		new ��������();

	}

}
