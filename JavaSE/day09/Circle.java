//抽象类的子类：实现父类所有的抽象方法
public class Circle extends Shape{
	private double radius;

	public Circle(){
	}
	public Circle(String color,double radius){
		 super(color);
		 this.radius=radius;
	}
	public void setRadius(double radius){	//用于修改半径
		this.radius=radius;
	}
	//子类的义务：
	public double calPerimeter(){
		return 2*Math.PI*radius;
	}
	public String getType(){
		return  getColor()+"圆形";
	}
	public static void main(String[] args){
		
		Shape s1=new Triangle("黑色" ,3,4,5);
		Shape s2=new Circle("黄色" ,3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
		
		Circle s22=(Circle)s2;
		s22.setRadius(8);
		System.out.println(s22.calPerimeter());
		
	}
}