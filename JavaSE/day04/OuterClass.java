//内部类和外部类的关系
//1.内部类可以访问外部类的成员，但是内部类的成员只有在内部类的范围之类是可知的，不能被外部类使用。
//2.内部类的对象实例化操作必须在外部类或外部类的非静态方法中实现
//3.如果从外部类中初始化一个内部类的对象，那么内部类对象就会绑定在外部类对象上。
		//也就是说当new一个外部类对象的时，内部类也开始存在一个对象。
//4.内部类中可以随意使用外部类的成员方法以及成员变量，即使这些类成员被private修饰
public class OuterClass{
	InnerClass in=new InnerClass();			//在外部类实例化内部类对象的引用
	public void ouf(){							//在外部类方法中引用内部内方法
		in.inf();
	}
	class InnerClass{
		InnerClass(){							//内部类的构造方法
			System.out.println("Hello Java");
		}
		int i=0;								//定义内部类的成员变量	
		public void inf(){						//内部类的成员方法
			System.out.println("Hello Andriod");
		}	
	}
	public InnerClass doit(){					//外部类方法，返回值为内部类引用
		//i=4; error 外部类不可以直接访问内部内的成员变量
		in.i=4;
		return new InnerClass();
	}
	public static void main(String[] args){
		OuterClass out=new OuterClass();
		OuterClass.InnerClass in=out.doit();
		OuterClass.InnerClass in2=out.new InnerClass();	//实例化内部类对象 new前面要加上外部类的对象的引用
	}
}