public class Employee{
	int id;
	String name;
	Double salary;
	//���췽��     ���ܱ��̳�
	public Employee(){
		System.out.println("�����޲ι��캯��");
	}
	public Employee(int id){
		System.out.println("����һ�ι��캯��");
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return  salary;
	}
	public void info(){
		System.out.println("�����info()");
		System.out.println("���:"+id+"\t����:"+name+"\tнˮ:"+salary);
	}
}