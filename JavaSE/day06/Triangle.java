public class Triangle extends Shape{
	//	��������������
	private double a;
	private double b;
	private double c;
	public Triangle(String color,double a,double b,double c){
		super(color);
		this.setSides(a,b,c);
	}
	public void setSides(double a,double b,double c){
		if(a>=b+c||b>=a+c||c>=a+b){
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//��дShape��ļ����ܳ��ķ���
	public double calPerimeter(){
		return a+b+c;
	}
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType(){
		return "������";
	}
	public static void main(String[] args){
		Shape t=new Triangle("��",3,4,5);
		System.out.println(t.calPerimeter());
		System.out.println(t.getType());
		
	}
}