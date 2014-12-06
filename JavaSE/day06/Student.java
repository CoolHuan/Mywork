public class Student extends OdinaryPeople{
	private String grade;
	private int clas;
	private int on;
	public void work(){
		System.out.println("学生的工作是学习");
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return this.grade;
	}
	
	public void setClas(int clas){
		this.clas=clas;
	}
	public int getClas(){
		return this.clas;
	}
	public void setOn(int on){
		this.on=on;
	}
	public int getOn(){
		return this.on;
	}
	public String toString(){
		return this.on+"\t"+this.name+"\t"+this.age+"\t"
		+this.grade+"\t"+this.clas;
	}
	public void print(Student a){
		System.out.println(a);
	}
}