public class SalariedEmployee extends Employee{
	int monthSalary;
	SalariedEmployee(String name,int birthMonth,int monthSalary){
		super(name,birthMonth);
		this.monthSalary=monthSalary;
	}
	public void getSalary(int month){
		super.getSalary(month);
		Salary=Salary+monthSalary;
		System.out.println(this.name+month+"月的薪水是"+this.Salary);
	}
}