import java.util.*;
public class UpdateStu{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();//创建Map实例
		map.put("01","李同学");
		map.put("02","魏同学");//向集合中添加元素
		Set<String> set=map.keySet(); //构建Map集合中所有key对象的集合
		Iterator<String> it=set.iterator();//创建集合迭代器
		System.out.println("key集合中的元素为：");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collection<String> coll=map.values();
		it=coll.iterator();
		System.out.println("values集合中的元素为：");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}