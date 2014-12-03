//访问对象的属性和行为，对象在堆内存中是相互独立的。改变一个对象的成员变量不会影响另一个对象的成员变量。
//如果希望成员变量不被其中任何一个对象改变，可以使用static关键字。
public class AccessProperty{
	static int i=47;
	public void call(){
		System.out.println("调用call()方法");
		for(i=0;i<3;i++){
			System.out.println(i+"");
			if(i==2){
			System.out.println("\n");
			}
		}
	}
	public AccessProperty(){
	} 
	public static void main(String[] args){
		AccessProperty t1=new AccessProperty();
		AccessProperty t2=new AccessProperty();
		t1.i=60;
		System.out.println("第一个实例变量调用i的结果为："+t1.i);
		//t1.call();     	// 此处调用call()方法会改变静态变量i的值；
		System.out.println("第二个实例变量调用i的结果为："+t2.i);
		t2.call();
	}
}