import java.util.*;
public class ForeachTest{
	public static void main(String[] args){
		Collection<String> list=new HashSet<>();
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�Ļ�");
		//�õ���������������Collection����Ԫ�ش���
	/*	Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
			if(str.equals("����")){
				it.remove();
			}
		}
		System.out.println(list);
	*/
	//��foreachѭ������������Collection����Ԫ�ظ����
		for(Object obj:list){
			String str=(String)obj;
			System.out.println(str);
		}
		System.out.println(list);
	}
}