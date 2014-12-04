//定义一个人类  具备2个成员方法
class Person{
	public static void eat(){
		System.out.println("在吃饭");
	}
	public static void work(Person p){
		System.out.println("在工作");
	}
}
public class Student extends Person{    //创建一个学生类继承人类
	public static void work(){			//重写父类的方法
		System.out.println("在看书");
	}
	public static void main(String[] args){
		Student t=new Student();		//实例化学生类对象
		work(t);						//向上转型 调用父类的方法
	}
}