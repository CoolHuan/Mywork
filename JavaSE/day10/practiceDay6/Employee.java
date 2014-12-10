public class Employee{
	String name;
	int Salary;
	int birthMonth;
	Employee(String name,int birthMonth){
		this.name=name;
		this.birthMonth=birthMonth;
	}
	public void getSalary(int month){
		if(birthMonth==month){
			Salary=Salary+100;
		}
	}
}