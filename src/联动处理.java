
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class 联动处理 extends JFrame{
	JComboBox combobox1,combobox2;
	Container container;
	String mystr1,mystr2;
	JLabel Label;
	public 联动处理(){
		container=this.getContentPane();
		combobox1=new JComboBox();
		combobox1.addItem("请选择班级");
		combobox1.addItem("13物联网1");
		combobox1.addItem("13物联网2");
		combobox1.addItem("14软工1");
		combobox1.addItem("14软工2");
		combobox1.addItemListener(new selectedListener());
		
		combobox2=new JComboBox();
		combobox2.addItem("请选择姓名");
		combobox2.addItem("张三");
		combobox2.addItem("慕容");
		combobox2.addItem("欧阳");
		combobox2.addItem("上官楚楚");
		combobox2.addItemListener(new selectedListener1());
		
		Label=new JLabel();
		
		JPanel panel;
		panel=new JPanel();
		panel.add(combobox1);
		panel.add(combobox2);
		panel.add(Label);
		
		container.add(BorderLayout.NORTH, panel);
		this.setTitle("联动处理");
		this.setVisible(true);
		this.setSize(500, 500);
	}
	class selectedListener implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			String str=(String)combobox1.getSelectedItem();
			if(event.getStateChange()==ItemEvent.SELECTED){
				if(str=="13物联网1"){
					mystr1="13物联网1";
				}
				else if(str=="13物联网2"){
					mystr1="13物联网2";
				}
				else if(str=="14软工2"){
					mystr1="14软工2";
				}
				else if(str=="14软工1"){
					mystr1="14软工1";
				}
			}
		}
	}

	class selectedListener1 implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			String str=(String)combobox2.getSelectedItem();
			if(event.getStateChange()==ItemEvent.SELECTED){
				if(str=="张三"){
					mystr2="张三";
				}
				else if(str=="慕容"){
					mystr2="慕容";
				}
				else if(str=="欧阳"){
					mystr2="欧阳";
				}
				else if(str=="上官楚楚"){
					mystr2="上官楚楚";
				}
			}
			String L;
			if(mystr1==null||mystr2==null){
				L="请完善您的信息！";
				Label.setText(L);
			}
			if(mystr1!=null&&mystr2!=null){
			L="班级:"+mystr1+"\0\0\0"+"姓名："+mystr2;
			Label.setText(L);
			}
			
		}
	}

	public static void main(String[] args) {
		new 联动处理();

	}

}
