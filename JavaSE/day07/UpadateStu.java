import java.util.*;
//����UpadateStu�� ʵ��Comparable�ӿ�
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
		UpadateStu stu1=new UpadateStu("��",0101);
		UpadateStu stu2=new UpadateStu("�ո�",0202);
		UpadateStu stu3=new UpadateStu("С��",0303);
		UpadateStu stu4=new UpadateStu("ɽ��",0404);
		
		TreeSet<UpadateStu> tree=new TreeSet<UpadateStu>();		//ʵ������������� �涨�洢UpadateStu����
	
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);											//�򼯺����������
		tree.add(stu4);
		
		Iterator<UpadateStu> it=tree.iterator();			//����һ��������
		System.out.println("Set�����е�����Ԫ��Ϊ��");
		
		while(it.hasNext()){
			UpadateStu stu=(UpadateStu)it.next();
			System.out.println(stu.getId()+""+stu.getName());
		}
		
		it=tree.headSet(stu2).iterator();
		System.out.println("��ȡǰ�沿�ֵļ���Ϊ��");
		
		while(it.hasNext()){
			UpadateStu stu=(UpadateStu)it.next();
			System.out.println(stu.getId()+""+stu.getName());
		}
			it=tree.subSet(stu2,stu4).iterator();
		System.out.println("��ȡ�м䲿�ֵļ���Ϊ��");
		
		while(it.hasNext()){
			UpadateStu stu=(UpadateStu)it.next();
			System.out.println(stu.getId()+""+stu.getName());
		}
		
	}
}