// List���Ͽ��Ը�������λ�öԼ��Ͻ��п��ٵ�������ʡ�
//����:
//get(int Index);	��ȡָ��λ�õ�����Ԫ��
//set(int index,Obejct obj);	��������ָ������λ�õĶ����޸�Ϊָ���Ķ���
import java.util.*;   //����util���������� 
public class Gather{
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();	//�������϶���
		list.add("a");
		list.add("b");								//�򼯺������Ԫ��
		list.add("c");
		int i=(int)(Math.random()*(list.size()-1));		//��ȡ0-2֮��������
		System.out.println("�����ȡ�����е�Ԫ���ǣ�"+list.get(i));
		list.remove(2);								//����������λ�õ�Ԫ�شӼ������Ƴ�
		System.out.println("��������2��Ԫ�ش�����������������е�Ԫ���ǣ�");
		/*for(int k=0;k<list.size();k++){					//ѭ����������
			System.out.print(list.get(k)+"\t");
		}*/
		Iterator<String> it=list.iterator();		//ͨ��������ѭ����������
		while(it.hasNext()){							
			String str=(String)it.next();		
			System.out.println(str);
		}	
	}
}