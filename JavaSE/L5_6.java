
import java.awt.*;
import javax.swing.*;
public class L5_6 extends JFrame{//���񲼾�
	JButton[] an={null,null,null,null,null,null,null,null,null};
	int s=9;
	public static void main(String[]args){
		L5_6 LX=new L5_6();
	}
	public L5_6(){
		an[0]=new JButton("��ս");
		an[1]=new JButton("����");
		an[2]=new JButton("������");
		an[3]=new JButton("����");
		an[4]=new JButton("����ʦ");
		an[5]=new JButton("Ԫ��ʦ");
		an[6]=new JButton("��ҩʦ");
		an[7]=new JButton("��еʦ");
		an[8]=new JButton("�񶷼�");

		this.setLayout(new GridLayout(3,3,15,15));
		for(int i=0;i<s;i++){
			this.add(an[i]);
		}

		this.setTitle("���񲼾�GridLayout");
		this.setSize(350,180);
		this.setLocation(300,260);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}