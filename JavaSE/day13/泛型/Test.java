import java.util.*;
public class Test{
	public void test(List<?> c){
		for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}
	}
	public static void main(String[] args){
		List<String> list=new ArrayList<>();
		list.add("大华");
		list.add("二华");
		list.add("三华");
		list.add("四华");
		Test t=new Test();
		t.test(list);
		
	}
}