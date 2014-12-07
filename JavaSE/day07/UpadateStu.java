import java.util.*;
//创建UpadateStu类 实现Comparable接口
public class UpadateStu implements Comparable<Object>{
	String name;
	long  id;
	
	public UpadateStu(String name,long id){
		this.name=name;
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public long getId(){
		return this.id;
	}
	
	public int compareTo(Object o){
		UpadateStu upstu=(UpadateStu)o;
		int result=id>upstu.id?1:(id==upstu.id?0:-1);
		return result;
	}
	public static void main(String[] args){
		UpadateStu stu1=new UpadateStu("大华",0101);
		UpadateStu stu2=new UpadateStu("刚刚",0202);
		UpadateStu stu3=new UpadateStu("小菜",0303);
		UpadateStu stu4=new UpadateStu("山鸡",0404);
		
		TreeSet<UpadateStu> tree=new TreeSet<UpadateStu>();		//实例化集合类对象 规定存储UpadateStu对象
	
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);											//向集合中添加数据
		tree.add(stu4);
		
		Iterator<UpadateStu> it=tree.iterator();			//创建一个迭代器
		System.out.println("Set集合中的所有元素为：");
		
		while(it.hasNext()){
			UpadateStu stu=(UpadateStu)it.next();
			System.out.println(stu.getId()+""+stu.getName());
		}
		
		it=tree.headSet(stu2).iterator();
		System.out.println("截取前面部分的集合为：");
		
		while(it.hasNext()){
			UpadateStu stu=(UpadateStu)it.next();
			System.out.println(stu.getId()+""+stu.getName());
		}
			it=tree.subSet(stu2,stu4).iterator();
		System.out.println("截取中间部分的集合为：");
		
		while(it.hasNext()){
			UpadateStu stu=(UpadateStu)it.next();
			System.out.println(stu.getId()+""+stu.getName());
		}
		
	}
}