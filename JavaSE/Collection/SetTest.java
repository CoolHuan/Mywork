//Set集合的通用知识 不能添加相同元素。内部用到equals()方法。
import java.util.*;
public class SetTest{
	public static void main(String[] args){
		Set<String> books=new HashSet<>();
		//添加一个字符串
		books.add(new String("疯狂Java讲义"));
		//再次添加一个字符串对象
		//因为两个字符串对象通过equals方法比较相等
		//所以添加失败，返回false
		boolean result=books.add(new String("疯狂Java讲义"));
		System.out.println(result+"--->"+books);
	}
}