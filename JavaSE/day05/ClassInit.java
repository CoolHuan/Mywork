public class ClassInit{
	//类变量
	static String str=getStaticVar();
	
	//实例变量
	int var=getIntVar();
	
	//构造方法
	public ClassInit(){
		System.out.println("构造方法");
	}
	//静态代码块   随着类的加载而加载 并且只执行一次，优先于主函数
	static{
		System.out.println("静态代码块");
	}
	//静态方法
	public static String getStaticVar(){
		System.out.println("类方法");
		return "Static变量";
	}
	//实例方法
	private int getIntVar(){
		System.out.println("实例方法");
		return 123;
	}
	public static void main(String[] args){
		System.out.println("进入main函数");
		ClassInit a=new ClassInit();
		System.out.println("退出main函数");
	}
}