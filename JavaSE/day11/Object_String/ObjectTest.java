public class ObjectTest{
	public int hashCode(){//��дObject���hashCode����
		return 60;
	}
	public String toString(){//��дObject���toString����
		return "So easy";
	}
	public static void main(String[] args){
		ObjectTest t=new ObjectTest();
		ObjectTest t1=new ObjectTest();
		// Object���е�equals�������ڼ��һ�������Ƿ������һ������
		//�����ǱȽ����������Ƿ������ͬ�����á�
		if(t.equals(t1))
		System.out.println("t����t1");
		else
		System.out.println("t������t1");
		//getClass()���ص�ǰ�������ڵ���
		System.out.println(t.getClass());	
		//hashCode(); ���ظö���Ĺ�ϣ��ֵ ���ص���ֵΪint��
		System.out.println(t1.hashCode());
		//toString() ���ظö�����ַ�����ʾ
		//���ַ����������ʹ˶����ϣ����޷���ʮ�����Ʊ�ʾ���
		System.out.println(t1.toString());
		
	}
}