import java.awt.*;
import javax.swing.*;
public class L5_4 extends JFrame{//边界布局管理器
	JButton an1,an2,an3,an4,an5;
	public static void main(String[]args){
		L5_4 lx=new L5_4();
		
	}
	public L5_4(){
		an1=new JButton("账户管理");
		an2=new JButton("游戏论坛");
		an3=new JButton("注册账号");
		an4=new JButton("官方网站");
		an5=new JButton("进入游戏");

		this.add(an1,BorderLayout.EAST);
		this.add(an2,BorderLayout.SOUTH);
		this.add(an3,BorderLayout.WEST);
		this.add(an4,BorderLayout.NORTH);
		this.add(an5,BorderLayout.CENTER);

		this.setTitle("用户界面BorderLayout");
		this.setSize(350,180);
		this.setLocation(300,260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}