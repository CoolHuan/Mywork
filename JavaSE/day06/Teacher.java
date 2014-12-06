public class Teacher extends OdinaryPeople{
	private int salary;
	private String subject;
	private	String  seniority;
	private int on;
	
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalry(){
		return this.salary;
	}
	public void setSubject(String subject){
		this.subject=subject;
	}
	public String getSubject(){
		return this.subject;
	}
	public void setOn(int on){
		this.on=on;
	}
	public int getOn(){
		return this.on;
	}
	public void work(){
		System.out.println("老师的工作是授课");
	}
	public String toString(){
		return this.on+"\t"+this.name+"\t"+this.age+"\t"
		+this.subject+"\t"+this.salary;
	}
	public void print(Teacher a){
		System.out.println(a);
	}
}