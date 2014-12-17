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
		
		bq1=new JLabel("用 户 名");
		bq2=new JLabel("密    码");
		
		an1=new JButton("官方网站");
		an2=new JButton("游戏论坛");
		an3=new JButton("游戏视频");
		an4=new JButton("账户管理");
		
		an5=new JButton("进入游戏");
		an6=new JButton("退出游戏");
		
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

		this.setTitle("进入游戏界面");
		this.setSize(500,180);
		this.setLocation(300,260);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}