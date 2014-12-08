import java.util.*;
public class MapTest{
	public static void main(String[] args){
		//由HashMap实现Map对象
		Map<String,String> map=new HashMap<String,String>();
		Emp emp1=new Emp("05","大华");
		Emp emp2=new Emp("04","二华");
		Emp emp3=new Emp("03","三华");
		map.put(emp1.getId(),emp1.getName());
		map.put(emp2.getId(),emp2.getName());
		map.put(emp3.getId(),emp3.getName());
		//Map接口中 keySet()方法 返回该集合中的所有key对象对应的值
		Set<String> set=map.keySet();
		//创建Set集合中所有对象的迭代器
		Iterator<String> it=set.iterator();
		System.out.println("HashMap类实现的Map集合，无序：");
		//遍历Map集合
		while(it.hasNext()){
			String str=(String)it.next();
			String name=(String)map.get(str);
			System.out.println(str+""+name);
		}
		//创建TreeMap集合对象
		TreeMap<String,String> treemap=new TreeMap<String,String>();
		//向集合中添加对象
		treemap.putAll(map);
		Iterator<String> it2=treemap.keySet().iterator();
		System.out.println("TreeMap类实现的Map集合，键对象升序：");
		//遍历TreeMap集合对象
			while(it2.hasNext()){
			String str=(String)it2.next();
			String name=(String)map.get(str);
			System.out.println(str+""+name);
		}
	}
}