//Dog ����Ĺ�

//ĳ��Ʒ�ֵĹ�
public class Dog{
	//����
	//Ʒ��
	//������   �������ڶ�������.�������
	static String type;
	
	//ʵ�������������ڶ��� ����������.ʵ��������
	int age;			
	String color;
	
	//��̬�����
	static{		//ʹ������ʼ�� �����
		type="xxxxxx";
	}
	//����
	
	Dog(){
		
	}
	Dog(int age,String color){
	this.type="��ʿ��";
		this.age=age;
		this.color=color;
	}
	//ʵ������: this��������ߵ�����
	
	void bark(){
		this.type="̩��";
		System.out.println("barking....");
	}
	//�෽�������ܷ��ʡ�ʵ��������===�������ڶ���
	static void bark1(){	//û�ж������Բ��ܷ���ʵ��������ʵ������
		//ֻ�ܷ�����������ֲ�����
		type="����";
		System.out.println("�෽��");
	}
}