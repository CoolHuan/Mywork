public class Sub extends Base{
	String str="sub class";	//�������е�����
	void sub_show(){
		System.out.println("Sub�����еķ���");
	}
	void show(){
		System.out.println("Sub�ิд�˸���ķ���");
	}
	public static void main(String[] args){
		//����ת�ͣ�Ĭ�ϻ������� ָ�� �������
		Base base=new Sub();
		//System.out.println(base.str);	 //����ת�ͺ�������ò��ɷ����������������Ժͷ���
		//base.sub_show();
	//	System.out.println(base.a);		
	//	base.base_show();
	//	base.show();					//���ʱ����า�ǵķ������ӡ���ิд��ķ���
		
		
		//����ת�ͣ���������� ָ�� ����Ķ���
						//sub����һ���������
		Sub sub=(Sub)base;	
		System.out.println(sub.a);	//����ת�ͺ���Է��ʸ��������
		sub.show();					//���Է��ʱ����ิд�ķ���
		sub.base_show();			//���Է��ʸ������еķ���
		sub.sub_show();				//���Է���Sub�����еķ���
	}
}