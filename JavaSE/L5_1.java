
import java.awt.*;
import javax.swing.*;
public class L5_1 {
	public static void main(String[] args){
		JFrame aa=new JFrame();
		aa.setTitle("用户界面");
		JButton an1=new JButton("进入游戏");
		aa.setSize(350,180);
		aa.setLocation(150 ,260);
		aa.add(an1);
		aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aa.setVisible(true);
	}
}

