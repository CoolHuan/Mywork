//测试person类

public class PersonTest{    
	public static void main(String[] args){
			//实例化:引用=变量=实例
			//在定义累的时候没有自定义无参函数
			//编译系统自动指定构造器
			//在定义的时候{有}无参构造器
			
			
			Person1	geminno = new Person1();
			Person1	gem = new Person1("高博");
			Person1 gemptc = new Person1("高博集团",12);
			
			
			//对象使用:引用.成员变量 引用.成员方法
			geminno.info();
			gem.info();
			gemptc.info();
			gem.setName("张三");
			gem.info();
			
			
	}
}