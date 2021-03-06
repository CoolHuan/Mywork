public class Triangle extends Shape{
	//定义三角形的三边
	private double a;
	private double b;
	private double c;
	//没有任何构造函数的情况下编译器才会为其设置一个默认的无参构造函数
	public Triangle(){
	}
	public Triangle(String color,double a,double b,double c){
		super(color);
		this.setSides(a,b,c);
	}
	public void setSides(double a,double b,double c){
		if(a>=b+c||b>=a+c||c>=a+b){
			System.out.println("三角形两边之和必须大于第三边");
			return;
		}
		this.a=a;
		this.b=b;
		this.c=c;
	
	}//重写Shape类的计算周长的抽象方法
	public double calPerimeter(){
		return a+b+c;
	}
	public String getType()
	{
		return this.getColor()+"三角形";
	}
}