//����������ࣺʵ�ָ������еĳ��󷽷�
public class Circle extends Shape{
	private double radius;

	public Circle(){
	}
	public Circle(String color,double radius){
		 super(color);
		 this.radius=radius;
	}
	public void setRadius(double radius){	//�����޸İ뾶
		this.radius=radius;
	}
	//���������
	public double calPerimeter(){
		return 2*Math.PI*radius;
	}
	public String getType(){
		return  getColor()+"Բ��";
	}
	public static void main(String[] args){
		
		Shape s1=new Triangle("��ɫ" ,3,4,5);
		Shape s2=new Circle("��ɫ" ,3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
		
		Circle s22=(Circle)s2;
		s22.setRadius(8);
		System.out.println(s22.calPerimeter());
		
	}
}