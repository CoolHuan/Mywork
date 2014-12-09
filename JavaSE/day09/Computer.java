//创建电脑类实现Card接口
public class Computer implements Card{
	public void run(){
		System.out.println("Card run");
	}
	public void close(){
		System.out.println("Card close");
	}
	public static void main(String[] args){
		Computer cp=new Computer();
		System.out.println("PCI接口大小为"+PCI.size);
		System.out.println("显卡类型："+cp.type);
		System.out.println("显卡价格："+cp.price);
		cp.run();
		cp.close();
	}
}
