public class Mobile implements USB,Wifi{
	private int num;
	private String brand;
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	//getter setter 
	
	//ʵ��������ʵ�ֽӿڡ����С��ĳ��󷽷�
	public void open(){
		System.out.println("Open Wifi");
	}
	public void close(){
		System.out.println("close Wifi");
	}
	public void read(){
		System.out.println("Read USB");
	}
	public void write(){
		System.out.println("Write USB");
	}
	//ʵ�������еķ���
	public void call(){
		System.out.println("��绰");
	}
	public void sms(){
		System.out.println("������");
	}
	//info()
	public void info(){
		System.out.println("Ʒ�ƣ�"+this.brand);
		System.out.println("���룺"+this.num);
	}
}