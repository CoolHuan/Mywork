//成员内部类测试
public class InnerTest{
	public static void main(String[] args){
	Cow cow=new Cow(378.9);
	//cow.test();
	Cow.CowLeg in=cow .new CowLeg(1.12,"黑白相间");
	in.info();
	}
}