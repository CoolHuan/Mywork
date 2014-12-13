/*
当创建了带泛型声明的接口、父类之后，可以为该接口创建实现类，
或从该父类派生子类，但需要指出的是，当使用这些接口、父类时
不能再包含类型形参//class A extends Apple<T>{}这句话编译错误
要给类型形参传入实际类型的值
*/
class A extends Apple<String>{
}
//定义Apple类时 使用了泛型声明
public class Apple<T>{
	//使用T类型形参定义实例变量
	private T info;
	public Apple(){}
	//下面方法中使用T类型形参来定义构造器
	public Apple(T info){
		this.info=info;
	}
	public void setInfo(T info){
		this.info=info;
	}
	public T getInfo(){
		return this.info;
	}
	public static void main(String[] args){
		Apple<String> a1=new Apple<>("苹果");
		System.out.println(a1.getInfo());
		Apple<Integer> a2=new Apple<>(555);
		System.out.println(a2.getInfo());
	}
}