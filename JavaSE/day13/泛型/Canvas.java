//设定类型通配符的上限
import java.util.*;
class Circle extends Shape{
	public void draw(Canvas c){
		System.out.println("在画布"+c+"上画一个圆");
	}
}
class Rectangle extends Shape{
	public void draw(Canvas c){
		System.out.println("把一个矩形画在画布"+c+"上");
}
}

public class Canvas{
	public void drawAll(List<? extends Shape> shapes){
		for (Shape s: shapes){
			s.draw(this);
		}
	}
	public static void main(String[] args){
		List<Circle> circleList=new ArrayList<>();
		Canvas c=new Canvas();
		//不能把List<Circle>当成List<Shape>使用
		//因为List<Circle>并不是List<Shape>的子类型
		c.drawAll(circleList);
	}
}