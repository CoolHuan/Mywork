//����person��

public class PersonTest{    
	public static void main(String[] args){
			//ʵ����:����=����=ʵ��
			//�ڶ����۵�ʱ��û���Զ����޲κ���
			//����ϵͳ�Զ�ָ��������
			//�ڶ����ʱ��{��}�޲ι�����
			
			
			Person1	geminno = new Person1();
			Person1	gem = new Person1("�߲�");
			Person1 gemptc = new Person1("�߲�����",12);
			
			
			//����ʹ��:����.��Ա���� ����.��Ա����
			geminno.info();
			gem.info();
			gemptc.info();
			gem.setName("��˼��");
			gem.info();
			
			
	}
}