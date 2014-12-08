import java.util.*;
public class MapTest{
	public static void main(String[] args){
		//��HashMapʵ��Map����
		Map<String,String> map=new HashMap<String,String>();
		Emp emp1=new Emp("05","��");
		Emp emp2=new Emp("04","����");
		Emp emp3=new Emp("03","����");
		map.put(emp1.getId(),emp1.getName());
		map.put(emp2.getId(),emp2.getName());
		map.put(emp3.getId(),emp3.getName());
		//Map�ӿ��� keySet()���� ���ظü����е�����key�����Ӧ��ֵ
		Set<String> set=map.keySet();
		//����Set���������ж���ĵ�����
		Iterator<String> it=set.iterator();
		System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
		//����Map����
		while(it.hasNext()){
			String str=(String)it.next();
			String name=(String)map.get(str);
			System.out.println(str+""+name);
		}
		//����TreeMap���϶���
		TreeMap<String,String> treemap=new TreeMap<String,String>();
		//�򼯺�����Ӷ���
		treemap.putAll(map);
		Iterator<String> it2=treemap.keySet().iterator();
		System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������");
		//����TreeMap���϶���
			while(it2.hasNext()){
			String str=(String)it2.next();
			String name=(String)map.get(str);
			System.out.println(str+""+name);
		}
	}
}