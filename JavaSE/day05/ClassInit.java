public class ClassInit{
	//�����
	static String str=getStaticVar();
	
	//ʵ������
	int var=getIntVar();
	
	//���췽��
	public ClassInit(){
		System.out.println("���췽��");
	}
	//��̬�����   ������ļ��ض����� ����ִֻ��һ�Σ�������������
	static{
		System.out.println("��̬�����");
	}
	//��̬����
	public static String getStaticVar(){
		System.out.println("�෽��");
		return "Static����";
	}
	//ʵ������
	private int getIntVar(){
		System.out.println("ʵ������");
		return 123;
	}
	public static void main(String[] args){
		System.out.println("����main����");
		ClassInit a=new ClassInit();
		System.out.println("�˳�main����");
	}
}