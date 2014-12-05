public class Test{
	public static void main(String[] args){
		Manager man=new Manager();
		Manager man1=new Manager(001,"บวบว");
		man1.info();
		man.id=1;
		man.name="geminno";
		man.salary=888888.8;
		man.car="Tesla";
		man.info();
		man.drive();
	}
}