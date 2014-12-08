public class Sub extends Base{
	String str="sub class";	//子类特有的属性
	void sub_show(){
		System.out.println("Sub类特有的方法");
	}
	void show(){
		System.out.println("Sub类复写了父类的方法");
	}
	public static void main(String[] args){
		//向上转型：默认基类引用 指向 子类对象
		Base base=new Sub();
		//System.out.println(base.str);	 //向上转型后基类引用不可访问子类新增的属性和方法
		//base.sub_show();
	//	System.out.println(base.a);		
	//	base.base_show();
	//	base.show();					//访问被子类覆盖的方法会打印子类复写后的方法
		
		
		//向下转型：子类的引用 指向 父类的对象
						//sub引用一个子类对象
		Sub sub=(Sub)base;	
		System.out.println(sub.a);	//向下转型后可以访问父类的属性
		sub.show();					//可以访问被子类复写的方法
		sub.base_show();			//可以访问父类特有的方法
		sub.sub_show();				//可以访问Sub类特有的方法
	}
}