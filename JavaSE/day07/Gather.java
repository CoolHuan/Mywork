// List集合可以根据索引位置对集合进行快速的随机访问。
//方法:
//get(int Index);	获取指定位置的索引元素
//set(int index,Obejct obj);	将集合中指定索引位置的对象修改为指定的对象
import java.util.*;   //导入util包中所有类 
public class Gather{
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();	//创建集合对象
		list.add("a");
		list.add("b");								//向集合中添加元素
		list.add("c");
		int i=(int)(Math.random()*(list.size()-1));		//获取0-2之间的随机数
		System.out.println("随机获取数组中的元素是："+list.get(i));
		list.remove(2);								//将集合索引位置的元素从集合中移除
		System.out.println("将索引是2的元素从数组中溢出后，数组中的元素是：");
		/*for(int k=0;k<list.size();k++){					//循环遍历集合
			System.out.print(list.get(k)+"\t");
		}*/
		Iterator<String> it=list.iterator();		//通过迭代器循环遍历集合
		while(it.hasNext()){							
			String str=(String)it.next();		
			System.out.println(str);
		}	
	}
}