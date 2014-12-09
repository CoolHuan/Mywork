import java.util.*;
public class Army{
	Weapon x;		//定义一个Weapon类型的变量
	Weapon[] w;		//定义一个Weapon类型的数组w
	//定义一个构造方法 接受一个int类型的参数并初始化w[]数组
	public Army(int num){
		w=new Weapon[num];
	}
	//定义一个方法 接受一个Weapon类型的参数 并赋值给变量x。
	public void addWeapon(Weapon wa){
		x=wa;
		Arrays.fill(w,wa); //使用同一个值对数组进行填充
	}
	
	public void attackAll(){	
		for(int i=0;i<w.length;i++){
			x.attack();
		}
	
	}
	public void moveAll(){
		for(int i=0;i<w.length;i++){
			x.move();
		}
	}
}