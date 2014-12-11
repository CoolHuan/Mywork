public class Test{
	public static void main(String[] args){
		//继承的向上转型VS接口、实现类的向上转型
		//USB JP=new USB_KEY(); 也是可以的。
		//但是要访问实现类特有属性需要向下转型
		USB_KEY JP=new USB_KEY();
		Udisk UP=new Udisk();
		JP.read();
		JP.write();
		System.out.println("键盘的品牌是："+JP.brand);
		UP.read();
		UP.write();
		System.out.println("U盘的品牌是："+UP.brand);
	}
}