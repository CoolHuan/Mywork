class Outer{
	int a=123;
	private String str="geminno";
	
	void run(){
		String local_var="局部变量";
		final int num=111;
		//局部内部类:
		//1、不能有访问修饰符
		//2、不可以在局部内部类中定义静态变量
		//3、可以访问当前代码块的常量，不能访问局部变量。
		//4.可以访问外部类的所有成员
		class Inner{
			int aaa=888;
			String str="inner class";
			static final String s="java";
			void inner_run(){
				System.out.println("内部类：成员方法");
				System.out.println(a+"\t"+str);
				System.out.println(Outer.this.str);
			}
		}
		Inner in=new Inner();
		in.inner_run();
	}
}
public class LocalInner{
	public static void main(String[] args){
		Outer out=new Outer();
		out.run();
	}
}