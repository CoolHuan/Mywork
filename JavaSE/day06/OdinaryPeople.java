//定义一个普通人的类
public class OdinaryPeople{
	protected String name;
	protected int age;
	
	public void work(){
		System.out.println("普通人的工作");
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