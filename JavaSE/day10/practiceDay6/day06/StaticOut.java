//��̬�ڲ������
class StaticOut{
	int a=100;
	static int b=200;
	//����һ����̬�ಿ�࣬��ʹ�÷��ʿ��Ʒ�
	static class StaticIn{
		static int c=500;
		public StaticIn(){
			System.out.println("��̬�ಿ�๹����"+"\tc="+c);
		}
		public void info(){
		System.out.println(b);//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա
		}
	}
	public void print(){
		System.out.println("a="+a+"\tb="+b);
	}
	public static void info1(){
		System.out.println("b="+b);
	}
	public static void main(String[] args){
		StaticOut.StaticIn in=new StaticOut.StaticIn();
		//in.info(); ���ܵ�����Ϊ��̬�ڲ���Ķ���inû���ⲿ��������ã����в��ܵ����ⲿ���ʵ��������
		StaticOut.info1();//
	}
}