import java.awt.*;
import javax.swing.*;
public class L5_8 extends JFrame{
	JPanel  mb1,mb2,mb3,mb4;
	JButton an1,an2,an3,an4,an5,an6;
	JLabel bq1,bq2;
	JTextField wbk;
	JPasswordField mmk;
	public static void main(String[]args){
		L5_8 lx=new L5_8();

	}
	public L5_8(){
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		mb4=new JPanel();
		
		bq1=new JLabel("�� �� ��");
		bq2=new JLabel("��    ��");
		
		an1=new JButton("�ٷ���վ");
		an2=new JButton("��Ϸ��̳");
		an3=new JButton("��Ϸ��Ƶ");
		an4=new JButton("�˻�����");
		
		an5=new JButton("������Ϸ");
		an6=new JButton("�˳���Ϸ");
		
		wbk=new JTextField(10);
		mmk=new JPasswordField(10);
		
		this.setLayout(new GridLayout(4,1));
		
		mb1.add(an1);	mb1.add(an2);	
		mb1.add(an3);	mb1.add(an4);
		mb2.add(bq1);   mb2.add(wbk);
		mb3.add(bq2);	mb3.add(mmk);
		mb4.add(an5);   mb4.add(an6);
		
		this.add(mb1);
		this.add(mb2);
		this.add(mb3);
		this.add(mb4);

		this.setTitle("������Ϸ����");
		this.setSize(500,180);
		this.setLocation(300,260);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}