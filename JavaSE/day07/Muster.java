//����Muster������������ʵ�������϶��󣬲��򼯺������Ԫ�أ�
//��󽫼����еĶ�����String��ʽ���
import java.util.*;					//����java.util��������ʵ����Ҫ��Ӹ����
public class Muster{									
	public static void main(String[] args){
		Collection<String> list=new ArrayList<>();  //ʵ�������������
		list.add("a");
		list.add("b");								//�򼯺����������
		list.add("c");
		list.add("d");
		Iterator<String> it=list.iterator();		//����������
		while(it.hasNext()){						//�ж��Ƿ�����һ��Ԫ��
			String str=(String)it.next();			//��ȡ�����е�Ԫ��
			System.out.println(str);
		}
	}
}