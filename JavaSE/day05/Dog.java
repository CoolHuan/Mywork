//Dog 抽象的狗

//某种品种的狗
public class Dog{
	//属性
	//品种
	//类属性   不依赖于对象【类名.类变量】
	static String type;
	
	//实例变量：依赖于对象 【对象引用.实例变量】
	int age;			
	String color;
	
	//静态代码块
	static{		//使命：初始化 类变量
		type="xxxxxx";
	}
	//方法
	
	Dog(){
		
	}
	Dog(int age,String color){
	this.type="哈士奇";
		this.age=age;
		this.color=color;
	}
	//实例方法: this代表调用者的引用
	
	void bark(){
		this.type="泰迪";
		System.out.println("barking....");
	}
	//类方法：不能访问【实例变量】===不依赖于对象，
	static void bark1(){	//没有对象，所以不能访问实例变量、实例方法
		//只能访问类变量、局部变量
		type="京巴";
		System.out.println("类方法");
	}
}