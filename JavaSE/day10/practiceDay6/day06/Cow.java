//��Ա�ڲ���
public class Cow{
	private double weight;
	//�ⲿ����������صĹ�����
	public Cow(){}
	public Cow(double weight){
		this.weight=weight;
	}
	//����һ���Ǿ�̬�ڲ���
	public class CowLeg{
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������صĹ�����
		public CowLeg(){}
		public CowLeg(double length,String color){
			this.length=length;
			this.color=color;
		}
		public void setLength(double length){
			this.length=length;
		}
		public double getLength(){
			return this.length;
		}
		public void setColor(String color){
			this.color=color;
		}
		public String getColor(){
			return this.color;
		}
		//�Ǿ�̬�ಿ���ʵ������
		public void info(){
			System.out.println("��ǰţ�ȵ���ɫ�ǣ�"+color+",�ߣ�"+length);
			//ֱ�ӷ����ⲿ���private���ε�Field
			System.out.println("��ţ��������ţ�أ�"+weight);
		}
		
	}
	public void test(){
		CowLeg c1=new CowLeg(1.12,"�ڰ����");
		c1.info();
	}
	
}