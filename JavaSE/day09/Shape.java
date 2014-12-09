//抽象类【只能被继承】---->子类：实现所有抽象方法---->子类创建对象
//不完整的类					完整类
public abstract class Shape{
	{
		System.out.println("执行shape的初始化块");
	}
	private String color;
	//周长 抽象方法：没有{}
	public abstract double calPerimeter();
	//形状 抽象方法
	public abstract String getType();

	public Shape(){}
	public Shape(String color){
		System.out.println("执行Shape的构造器。。");
		this.color=color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}

}