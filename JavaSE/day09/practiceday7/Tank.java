//创建一个Tank类继承继承Weapon抽象类
public class Tank extends Weapon{
//重写父类的move()方法
	public void move(){
	System.out.println("陆地上跑");
	}
//重写父类的attack()方法
	public void attack(){
	System.out.println("炮弹攻击");	
	} 
}