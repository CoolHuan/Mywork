//成员变量初始化工作？===构造函数
//类变量能不能在构造函数中初始化？        可以
/*static变量
1.一个类只有一份,被类的所有实例共享
	2.随着类的加载而加载,优先于对象存在
	3.能在没有生成人和类的实例时就访问到,从莫种意义类似于
	全局变量
	4.可以直接使用类名来访问:类.字段
	5.实例方法中可以访问类变量
	*/

public class DogTest{
	public static void main(String[] args){
	//类方法
		Dog.bark1();
		Dog d=new Dog(10,"白");
	//类变量
		System.out.println("type="+Dog.type);
		//Dog.type="藏獒";
		//System.out.println("type="+Dog.type);
	//实例变量
		Dog dog=new Dog(15,"黑");
		System.out.println("age="+d.age);
		System.out.println("age="+dog.age);
	}
}