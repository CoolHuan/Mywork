//局部内部类：定义在方法中的类
public class LocalInnerClass{
	public static void main(String[] args){
		//定义局部类部类
		class InnerBase{
			int a;
		}
		//定义局部内部类的子类
		class InnerSub extends InnerBase{
			int b;
		}
		//创建局部内部类的对象
		InnerSub is= new InnerSub();
		is.a=5;
		is.b=8;
		System.out.println("InnerSub对象的a和b属性是："+is.a+"和"+is.b);
	}
}