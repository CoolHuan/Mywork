//构造器练习
public class ConstructorTest{ 
	String name;
	int age;
	//提供一个无参构造器
	
	public ConstructorTest(){
	
	}
	//定义一个一参构造器
	
	public ConstructorTest(int age){
		this.age=age;
	}
	//定义一个两参构造器
	
	public ConstructorTest(int age,String name){
		this(age);
		this.name=name;
	}
	public void swap(){
		System.out.println("name:"+name+"\tage:"+age);
	}
	public static void main(String[] args){
		ConstructorTest a=new ConstructorTest();
		ConstructorTest b=new ConstructorTest(20);
		ConstructorTest c=new ConstructorTest(25,"小明");
		a.swap();
		b.swap();
		c.swap();
	}
}