import java.awt.*;
import javax.swing.*;
public class L5_5 extends JFrame{//流式布局
	JButton[] an={null,null,null,null,null,null,null};
	public static void main(String[]args){
		L5_5 LX=new L5_5();
	}
	public L5_5(){
		an[0]=new JButton("狂战");
		an[1]=new JButton("鬼泣");
		an[2]=new JButton("阿修罗");
		an[3]=new JButton("剑魂");
		an[4]=new JButton("冰结师");
		an[5]=new JButton("元素师");
		an[6]=new JButton("弹药师");
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

		this.setTitle("流式布局FlowLayout");
		this.setSize(350,180);
		this.setLocation(300,260);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}