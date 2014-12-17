
import java.awt.*;
import javax.swing.*;
public class L5_6 extends JFrame{//网格布局
	JButton[] an={null,null,null,null,null,null,null,null,null};
	int s=9;
	public static void main(String[]args){
		L5_6 LX=new L5_6();
	}
	public L5_6(){
		an[0]=new JButton("狂战");
		an[1]=new JButton("鬼泣");
		an[2]=new JButton("阿修罗");
		an[3]=new JButton("剑魂");
		an[4]=new JButton("冰结师");
		an[5]=new JButton("元素师");
		an[6]=new JButton("弹药师");
		an[7]=new JButton("机械师");
		an[8]=new JButton("格斗家");

		this.setLayout(new GridLayout(3,3,15,15));
		for(int i=0;i<s;i++){
			this.add(an[i]);
		}

		this.setTitle("网格布局GridLayout");
		this.setSize(350,180);
		this.setLocation(300,260);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}