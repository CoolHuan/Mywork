//创建Muster类在主方法中实例化集合对象，并向集合中添加元素，
//最后将集合中的对象以String形式输出
import java.util.*;					//导入java.util包，其他实例都要添加该语句
public class Muster{									
	public static void main(String[] args){
		Collection<String> list=new ArrayList<>();  //实例化集合类对象
		list.add("a");
		list.add("b");								//向集合中添加数据
		list.add("c");
		list.add("d");
		Iterator<String> it=list.iterator();		//创建迭代器
		while(it.hasNext()){						//判断是否有下一个元素
			String str=(String)it.next();			//获取集合中的元素
			System.out.println(str);
		}
	}
}