import java.util.*;
public class UpdateStu{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();//����Mapʵ��
		map.put("01","��ͬѧ");
		map.put("02","κͬѧ");//�򼯺������Ԫ��
		Set<String> set=map.keySet(); //����Map����������key����ļ���
		Iterator<String> it=set.iterator();//�������ϵ�����
		System.out.println("key�����е�Ԫ��Ϊ��");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collection<String> coll=map.values();
		it=coll.iterator();
		System.out.println("values�����е�Ԫ��Ϊ��");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}