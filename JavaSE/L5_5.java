import java.awt.*;
import javax.swing.*;
public class L5_5 extends JFrame{//��ʽ����
	JButton[] an={null,null,null,null,null,null,null};
	public static void main(String[]args){
		L5_5 LX=new L5_5();
	}
	public L5_5(){
		an[0]=new JButton("��ս");
		an[1]=new JButton("����");
		an[2]=new JButton("������");
		an[3]=new JButton("����");
		an[4]=new JButton("����ʦ");
		an[5]=new JButton("Ԫ��ʦ");
		an[6]=new JButton("��ҩʦ");
		//this.setLayout(new FlowLayout());
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		//this.setLayout(new FlowLayout(FlowLayout.RIGHT));

		this.add(an[0]);
		this.add(an[1]);
		this.add(an[2]);
		this.add(an[3]);
		this.add(an[4]);
		this.add(an[5]);
		this.add(an[6]);

		this.setTitle("��ʽ����FlowLayout");
		this.setSize(350,180);
		this.setLocation(300,260);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}