public class BasePlusSalesEmployee extends SalesEmployee{
	BasePlusSalesEmployee(String name,int birthMonth,int monthMoney,Double percent,int BasePlus){
		super(name,birthMonth,monthMoney,percent);
		this.BasePlus=BasePlus;
	}
	public void getSalary(int month){
		super.getSalary(month);
	}
}