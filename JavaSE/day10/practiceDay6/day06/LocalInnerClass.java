//�ֲ��ڲ��ࣺ�����ڷ����е���
public class LocalInnerClass{
	public static void main(String[] args){
		//����ֲ��ಿ��
		class InnerBase{
			int a;
		}
		//����ֲ��ڲ��������
		class InnerSub extends InnerBase{
			int b;
		}
		//�����ֲ��ڲ���Ķ���
		InnerSub is= new InnerSub();
		is.a=5;
		is.b=8;
		System.out.println("InnerSub�����a��b�����ǣ�"+is.a+"��"+is.b);
	}
}