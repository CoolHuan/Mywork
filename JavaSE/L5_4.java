import java.awt.*;
import javax.swing.*;
public class L5_4 extends JFrame{//�߽粼�ֹ�����
	JButton an1,an2,an3,an4,an5;
	public static void main(String[]args){
		L5_4 lx=new L5_4();
		
	}
	public L5_4(){
		an1=new JButton("�˻�����");
		an2=new JButton("��Ϸ��̳");
		an3=new JButton("ע���˺�");
		an4=new JButton("�ٷ���վ");
		an5=new JButton("������Ϸ");

		this.add(an1,BorderLayout.EAST);
		this.add(an2,BorderLayout.SOUTH);
		this.add(an3,BorderLayout.WEST);
		this.add(an4,BorderLayout.NORTH);
		this.add(an5,BorderLayout.CENTER);

		this.setTitle("�û�����BorderLayout");
		this.setSize(350,180);
		this.setLocation(300,260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}