class Outer{
	//��Ա����
	int a=123;
	private String str="�ⲿ�����";
	
	//��Ա�ڲ���
	class Inner{
		//static  ��Ա�ڲ��಻�����徲̬������
		final static int a=123;
		String str="�ڲ������";
		void  run(){
			String str="�ֲ�����";
			System.out.println("�ڲ���run()����");
			//���ڲ����з����ⲿ���Ա
			System.out.println(a+str);
			System.out.println(a+this.str);
			System.out.println(a+Outer.this.str);
			//���� System.out.println(a+new Outer().str);
		}
	
	}
	
	//��Ա����
	void run(){
		System.out.println("�ⲿ��run()����");
		//�ڲ�����Է����ⲿ��ĳ�Ա��������
		Inner in=new Inner();
		in.run();
	}
	static void static_run(){
	System.out.println("�ⲿ��static_run()");
		Outer.Inner in=new Outer().new Inner();
		in.run();
	}

}
public class InnerDemo{
	public static void main(String[] args){
		//�ⲿ���ʹ��
		Outer outer=new Outer();
		outer.static_run();
		
		//3���ڲ���
		//Outer out=new Outer();
		//Outer.Inner in=out.new Inner();
		//in.run();
		//Outer.Inner inner=new Outer().new Inner();
		//inner.run();
		
	}
}