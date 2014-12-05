public class Employee{
	int id;
	String name;
	Double salary;
	//构造方法     不能被继承
	public Employee(){
		System.out.println("父类无参构造函数");
	}
	public Employee(int id){
		System.out.println("父类一参构造函数");
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return  salary;
	}
	public void info(){
		System.out.println("父类的info()");
		System.out.println("编号:"+id+"\t姓名:"+name+"\t薪水:"+salary);
	}
}