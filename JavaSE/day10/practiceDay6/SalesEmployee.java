public class SalesEmployee extends Employee{
	int BasePlus=0;
	int monthMoney;	//�����۶�
	Double percent;	//�����
	SalesEmployee(String name,int birthMonth,int monthMoney,Double percent){
		super(name,birthMonth);
		this.monthMoney=monthMoney;
		this.percent=percent;
	}
		public void getSalary(int month){
			super.getSalary(month);
			Salary=(int)(Salary+monthMoney*percent)+BasePlus;
			System.out.println(this.name+month+"�µ�нˮ��"+this.Salary);
		}
}