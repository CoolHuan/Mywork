public class Manager extends Employee{
	String car;
	String office;
	//构造方法
	//子类构造方法：必须调用父类构造方法
	//子类的构造方法中没有显示的调用基类构造方法，则系统默认调用基类无参的构造方法。
	public Manager(){
	System.out.println("子类无参构造方法");
	}
	//子类一参构造方法
	public Manager(int id){
		super(id);	//父类的构造函数
			
		this.id=id;
		System.out.println("子类一参构造方法");
	}
	public Manager(int id,String name){
		this(id);
		System.out.println("子类两参构造方法");
		this.name=name;
		
	}
	
	public void info(){
		System.out.println("子类的info()");
		//System.out.println("编号:"+id+"\t姓名:"+name+"\t薪水:"+salary+"\t开"+car+"上班");
		super.info();	//	父类的引用
	}
	
	public  void drive(){
		System.out.println("name:"+name+"开"+car+"上班");
	}
}