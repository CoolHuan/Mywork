//�趨����ͨ���������
import java.util.*;
class Circle extends Shape{
	public void draw(Canvas c){
		System.out.println("�ڻ���"+c+"�ϻ�һ��Բ");
	}
}
class Rectangle extends Shape{
	public void draw(Canvas c){
		System.out.println("��һ�����λ��ڻ���"+c+"��");
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
		//���ܰ�List<Circle>����List<Shape>ʹ��
		//��ΪList<Circle>������List<Shape>��������
		c.drawAll(circleList);
	}
}