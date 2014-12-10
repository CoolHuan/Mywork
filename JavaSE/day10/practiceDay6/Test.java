public class Test{
	public static void main(String[] args){
		SalariedEmployee a=new SalariedEmployee("大华",6,2000);
		a.getSalary(6);
		HourlyEmployee b=new HourlyEmployee("二华",50,100,8);
		b.getSalary(6);
		SalesEmployee c=new SalesEmployee("三华",8,100000,0.3);
		c.getSalary(6);
		BasePlusSalesEmployee d=new BasePlusSalesEmployee("四华",7,20000,0.3,3000);
		d.getSalary(6);
	}
	
		
}