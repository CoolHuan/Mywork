//����һ����ͨ�˵���
public class OdinaryPeople{
	protected String name;
	protected int age;
	
	public void work(){
		System.out.println("��ͨ�˵Ĺ���");
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}

}