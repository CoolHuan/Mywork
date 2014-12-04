public class InstanceofTest{
	public static void main(String[] args){
		Person1 p = new Person1("android",12);
		String str = new String("hello");
		//要有继承关系
		if(str instanceof Object){
			System.out.println("str 是object类");
		}else{
			System.out.println("str不是object类");
		}	
	}
}