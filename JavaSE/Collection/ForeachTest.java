import java.util.*;
public class ForeachTest{
	public static void main(String[] args){
		Collection<String> list=new HashSet<>();
		list.add("大华");
		list.add("二华");
		list.add("三华");
		list.add("四华");
		//用迭代器来迭代访问Collection集合元素代码
	/*	Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
			if(str.equals("二华")){
				it.remove();
			}
		}
		System.out.println(list);
	*/
	//用foreach循环来迭代访问Collection集合元素更简洁
		for(Object obj:list){
			String str=(String)obj;
			System.out.println(str);
		}
		System.out.println(list);
	}
}