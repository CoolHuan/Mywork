//����һ������  �߱�2����Ա����
class Person{
	public static void eat(){
		System.out.println("�ڳԷ�");
	}
	public static void work(Person p){
		System.out.println("�ڹ���");
	}
}
public class Student extends Person{    //����һ��ѧ����̳�����
	public static void work(){			//��д����ķ���
		System.out.println("�ڿ���");
	}
	public static void main(String[] args){
		Student t=new Student();		//ʵ����ѧ�������
		work(t);						//����ת�� ���ø���ķ���
	}
}