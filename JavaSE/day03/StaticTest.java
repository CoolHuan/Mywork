//静态变量、常量、方法的使用
//静态方法中不能使用this关键字，也不可以直接调用非静态方法。
//Java中规定不能将方法体内的局部变量声明为static 
//static{}静态代码块 用于先执行类的初始化，只会执行一次并且优先于主函数。
public class StaticTest{
	static double PI=3.1415;
	static int id;
	public static void method1(){
		System.out.println("在类中定义静态方法");
	}	
	public static void method2(){
		System.out.println(StaticTest.PI);//调用静态常量
		System.out.println(StaticTest.id);//调用静态变量
		StaticTest.method1();// 调用静态方法
	}
	public static void main(String[] args){
		StaticTest.method1();
		StaticTest.method2();
	}
}