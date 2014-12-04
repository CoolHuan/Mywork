public class AnyThting{
	public AnyThting(){
		this("this调用有参构造方法");				
		System.out.println("无参构造方法");
	}
	public AnyThting(String str){
		System.out.println("有参构造方法");
	}
	public static void main(String args[]){
		AnyThting abc=new AnyThting();
	}
}