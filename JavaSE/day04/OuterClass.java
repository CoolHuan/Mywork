//�ڲ�����ⲿ��Ĺ�ϵ
//1.�ڲ�����Է����ⲿ��ĳ�Ա�������ڲ���ĳ�Աֻ�����ڲ���ķ�Χ֮���ǿ�֪�ģ����ܱ��ⲿ��ʹ�á�
//2.�ڲ���Ķ���ʵ���������������ⲿ����ⲿ��ķǾ�̬������ʵ��
//3.������ⲿ���г�ʼ��һ���ڲ���Ķ�����ô�ڲ������ͻ�����ⲿ������ϡ�
		//Ҳ����˵��newһ���ⲿ������ʱ���ڲ���Ҳ��ʼ����һ������
//4.�ڲ����п�������ʹ���ⲿ��ĳ�Ա�����Լ���Ա��������ʹ��Щ���Ա��private����
public class OuterClass{
	InnerClass in=new InnerClass();			//���ⲿ��ʵ�����ڲ�����������
	public void ouf(){							//���ⲿ�෽���������ڲ��ڷ���
		in.inf();
	}
	class InnerClass{
		InnerClass(){							//�ڲ���Ĺ��췽��
			System.out.println("Hello Java");
		}
		int i=0;								//�����ڲ���ĳ�Ա����	
		public void inf(){						//�ڲ���ĳ�Ա����
			System.out.println("Hello Andriod");
		}	
	}
	public InnerClass doit(){					//�ⲿ�෽��������ֵΪ�ڲ�������
		//i=4; error �ⲿ�಻����ֱ�ӷ����ڲ��ڵĳ�Ա����
		in.i=4;
		return new InnerClass();
	}
	public static void main(String[] args){
		OuterClass out=new OuterClass();
		OuterClass.InnerClass in=out.doit();
		OuterClass.InnerClass in2=out.new InnerClass();	//ʵ�����ڲ������ newǰ��Ҫ�����ⲿ��Ķ��������
	}
}