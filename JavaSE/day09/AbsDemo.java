public abstract class AbsDemo{
	//抽象类组成
	
	//构造方法：在子类的构造方法中用，！new
	abstract void run();
	
	public static void main(String[] args){
		//抽象类：不能直接实例化对象
		//AbsDemo abs=new AbsDemo();
	}
}