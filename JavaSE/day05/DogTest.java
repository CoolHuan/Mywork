//��Ա������ʼ��������===���캯��
//������ܲ����ڹ��캯���г�ʼ����        ����
/*static����
1.һ����ֻ��һ��,���������ʵ������
	2.������ļ��ض�����,�����ڶ������
	3.����û�������˺����ʵ��ʱ�ͷ��ʵ�,��Ī������������
	ȫ�ֱ���
	4.����ֱ��ʹ������������:��.�ֶ�
	5.ʵ�������п��Է��������
	*/

public class DogTest{
	public static void main(String[] args){
	//�෽��
		Dog.bark1();
		Dog d=new Dog(10,"��");
	//�����
		System.out.println("type="+Dog.type);
		//Dog.type="����";
		//System.out.println("type="+Dog.type);
	//ʵ������
		Dog dog=new Dog(15,"��");
		System.out.println("age="+d.age);
		System.out.println("age="+dog.age);
	}
}