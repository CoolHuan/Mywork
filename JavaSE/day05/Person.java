//单例设计模式  解决一个类只在内存中存在一个对象
class Person{
	String name;
	private Person(){
	}
	static Person p=new Person();
	public static Person getInstance(){
		return p;
	}
}