public class Manager extends Employee{
	String car;
	String office;
	//���췽��
	//���๹�췽����������ø��๹�췽��
	//����Ĺ��췽����û����ʾ�ĵ��û��๹�췽������ϵͳĬ�ϵ��û����޲εĹ��췽����
	public Manager(){
	System.out.println("�����޲ι��췽��");
	}
	//����һ�ι��췽��
	public Manager(int id){
		super(id);	//����Ĺ��캯��
			
		this.id=id;
		System.out.println("����һ�ι��췽��");
	}
	public Manager(int id,String name){
		this(id);
		System.out.println("�������ι��췽��");
		this.name=name;
		
	}
	
	public void info(){
		System.out.println("�����info()");
		//System.out.println("���:"+id+"\t����:"+name+"\tнˮ:"+salary+"\t��"+car+"�ϰ�");
		super.info();	//	���������
	}
	
	public  void drive(){
		System.out.println("name:"+name+"��"+car+"�ϰ�");
	}
}