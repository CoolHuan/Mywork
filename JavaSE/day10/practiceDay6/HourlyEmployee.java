public class HourlyEmployee extends Employee{
	int hourSalary;
	int workHours;
	HourlyEmployee(String name,int hourSalary,int workHours,int birthMonth){
	super(name,birthMonth);
	this.hourSalary=hourSalary;
	this.workHours=workHours;
	}
	public void getSalary(int month){
		super.getSalary(month);
		if(workHours<160){
		Salary=Salary+workHours*hourSalary;
		}else{
			Salary=(int)(Salary+160*hourSalary+1.5*(workHours-160)*hourSalary);
		}
		System.out.println(this.name+month+"月的薪水是"+this.Salary);
	}

}