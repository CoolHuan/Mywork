import java.util.*;
public class Test{
	public void test(List<?> c){
		for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}
	}
	public static void main(String[] args){
		List<String> list=new ArrayList<>();
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�Ļ�");
		Test t=new Test();
		t.test(list);
		
	}
}