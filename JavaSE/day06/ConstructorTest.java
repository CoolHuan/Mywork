//��������ϰ
public class ConstructorTest{ 
	String name;
	int age;
	//�ṩһ���޲ι�����
	
	public ConstructorTest(){
	
	}
	//����һ��һ�ι�����
	
	public ConstructorTest(int age){
		this.age=age;
	}
	//����һ�����ι�����
	
	public ConstructorTest(int age,String name){
		this(age);
		this.name=name;
	}
	public void swap(){
		System.out.println("name:"+name+"\tage:"+age);
	}
	public static void main(String[] args){
		ConstructorTest a=new ConstructorTest();
		ConstructorTest b=new ConstructorTest(20);
		ConstructorTest c=new ConstructorTest(25,"С��");
		a.swap();
		b.swap();
		c.swap();
	}
}