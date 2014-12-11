class Outer{
	//成员变量
	int a=123;
	private String str="外部类变量";
	
	//成员内部类
	class Inner{
		//static  成员内部类不允许定义静态变量。
		final static int a=123;
		String str="内部类变量";
		void  run(){
			String str="局部变量";
			System.out.println("内部类run()方法");
			//在内部类中访问外部类成员
			System.out.println(a+str);
			System.out.println(a+this.str);
			System.out.println(a+Outer.this.str);
			//或者 System.out.println(a+new Outer().str);
		}
	
	}
	
	//成员方法
	void run(){
		System.out.println("外部类run()方法");
		//内部类可以放在外部类的成员方法当中
		Inner in=new Inner();
		in.run();
	}
	static void static_run(){
	System.out.println("外部类static_run()");
		Outer.Inner in=new Outer().new Inner();
		in.run();
	}

}
public class InnerDemo{
	public static void main(String[] args){
		//外部类的使用
		Outer outer=new Outer();
		outer.static_run();
		
		//3、内部类
		//Outer out=new Outer();
		//Outer.Inner in=out.new Inner();
		//in.run();
		//Outer.Inner inner=new Outer().new Inner();
		//inner.run();
		
	}
}