public class Triangle extends Shape{
	//���������ε�����
	private double a;
	private double b;
	private double c;
	//û���κι��캯��������±������Ż�Ϊ������һ��Ĭ�ϵ��޲ι��캯��
	public Triangle(){
	}
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
	
	}//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return a+b+c;
	}
	public String getType()
	{
		return this.getColor()+"������";
	}
}