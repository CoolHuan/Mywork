import java.util.*;
public class ListTest{
	 
	public static void main(String[] args){
	
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<100;i++){
			Integer a=(Integer)i;
			list.add(i);
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.remove(10);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}