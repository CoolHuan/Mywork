import java.awt.*;
import javax.swing.*;
public class L5_9 extends JFrame{
	JPanel mb1,mb2,mb3;
	JButton an1,an2;
	JLabel bq1,bq2;
	JCheckBox fk1,fk2,fk3;
	JRadioButton dx1,dx2;
	ButtonGroup dxz;
	public static void main(String[]args){
		L5_9 LX=new L5_9();
	}
	L5_9(){
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		
		an1=new JButton("ע��");
		an2=new JButton("�˳�");
		
		bq1=new JLabel("�س�");
		bq2=new JLabel("�Ա�");
		
		fk1=new JCheckBox("����");
		fk2=new JCheckBox("����");
		fk3=new JCheckBox("����");
		
		dx1=new JRadioButton("��");
		dx2=new JRadioButton("Ů");
		
		dxz=new ButtonGroup();
		dxz.add(dx1); dxz.add(dx2);
		
		this.setLayout(new GridLayout(3,1));
		
		mb1.add(bq1); mb1.add(fk1); mb1.add(fk2); mb1.add(fk3);
		mb2.add(bq2); mb2.add(dx1); mb2.add(dx2);
		mb3.add(an1); mb3.add(an2);
		
		this.add(mb1);
		this.add(mb2);
		this.add(mb3);
		
		this.setTitle("�û�ע��");
		this.setSize(300,200);
		this.setLocation(300,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}

}