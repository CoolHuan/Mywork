//��̬������������������ʹ��
//��̬�����в���ʹ��this�ؼ��֣�Ҳ������ֱ�ӵ��÷Ǿ�̬������
//Java�й涨���ܽ��������ڵľֲ���������Ϊstatic 
//static{}��̬����� ������ִ����ĳ�ʼ����ֻ��ִ��һ�β�����������������
public class StaticTest{
	static double PI=3.1415;
	static int id;
	public static void method1(){
		System.out.println("�����ж��徲̬����");
	}	
	public static void method2(){
		System.out.println(StaticTest.PI);//���þ�̬����
		System.out.println(StaticTest.id);//���þ�̬����
		StaticTest.method1();// ���þ�̬����
	}
	public static void main(String[] args){
		StaticTest.method1();
		StaticTest.method2();
	}
}