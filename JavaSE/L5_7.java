import java.awt.*;
import javax.swing.*;
public class L5_7 extends JFrame{
	JPanel  mb1,mb2;
	JButton an0,an1,an2,an3,an4,an5,an6;
	public static void main(String[]args){
		L5_7 lx=new L5_7();

	}
	public L5_7(){
		mb1=new JPanel();//Ĭ����ʽ����
		mb2=new JPanel();
		an0=new JButton("��Ϸ����");
		an1=new JButton("�˻�����");
		an2=new JButton("��Ϸ��̳");
		an3=new JButton("��Ϸ��Ƶ");
		an4=new JButton("�ٷ���վ");
		an5=new JButton("������Ϸ");
		an6=new JButton("�˳���Ϸ");
		mb1.add(an4);	mb1.add(an3);	
		mb1.add(an2);	mb1.add(an1);
		mb2.add(an5);   mb2.add(an6);

		
		this.add(mb2,BorderLayout.SOUTH);
		
		this.add(mb1,BorderLayout.NORTH);
		this.add(an0);

		this.setTitle("�����ۺ�Ӧ��");
		this.setSize(500,180);
		this.setLocation(300,260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
