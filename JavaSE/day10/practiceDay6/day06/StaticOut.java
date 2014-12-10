//静态内部类测试
class StaticOut{
	int a=100;
	static int b=200;
	//定义一个静态类部类，不使用访问控制符
	static class StaticIn{
		static int c=500;
		public StaticIn(){
			System.out.println("静态类部类构造器"+"\tc="+c);
		}
		public void info(){
		System.out.println(b);//静态内部类只能访问外部类的静态成员
		}
	}
	public void print(){
		System.out.println("a="+a+"\tb="+b);
	}
	public static void info1(){
		System.out.println("b="+b);
	}
	public static void main(String[] args){
		StaticOut.StaticIn in=new StaticOut.StaticIn();
		//in.info(); 不能调用因为静态内部类的对象in没有外部类对象引用，所有不能调用外部类的实例方法。
		StaticOut.info1();//
	}
}