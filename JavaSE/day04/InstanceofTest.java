public class InstanceofTest{
	public static void main(String[] args){
		Person1 p = new Person1("android",12);
		String str = new String("hello");
		//Ҫ�м̳й�ϵ
		if(str instanceof Object){
			System.out.println("str ��object��");
		}else{
			System.out.println("str����object��");
		}	
	}
}