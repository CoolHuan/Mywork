public class Mobile implements USB,Wifi{
	private int num;
	private String brand;
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	//getter setter 
	
	//实现类义务：实现接口【所有】的抽象方法
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
	//实现类特有的方法
	public void call(){
		System.out.println("打电话");
	}
	public void sms(){
		System.out.println("发短信");
	}
	//info()
	public void info(){
		System.out.println("品牌："+this.brand);
		System.out.println("号码："+this.num);
	}
}