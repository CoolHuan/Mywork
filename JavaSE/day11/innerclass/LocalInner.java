class Outer{
	int a=123;
	private String str="geminno";
	
	void run(){
		String local_var="�ֲ�����";
		final int num=111;
		//�ֲ��ڲ���:
		//1�������з������η�
		//2���������ھֲ��ڲ����ж��徲̬����
		//3�����Է��ʵ�ǰ�����ĳ��������ܷ��ʾֲ�������
		//4.���Է����ⲿ������г�Ա
		class Inner{
			int aaa=888;
			String str="inner class";
			static final String s="java";
			void inner_run(){
				System.out.println("�ڲ��ࣺ��Ա����");
				System.out.println(a+"\t"+str);
				System.out.println(Outer.this.str);
			}
		}
		Inner in=new Inner();
		in.inner_run();
	}
}
public class LocalInner{
	public static void main(String[] args){
		Outer out=new Outer();
		out.run();
	}
}