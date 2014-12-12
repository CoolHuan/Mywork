package gem.javase;
class Person{
	String name;
	int age;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "������"+this.name+"\t����:"+this.age;
	}
	//ͬһ�����  ���ԣ�
	public boolean equals(Object obj){
		//�Ƿ�ָ��ͬһ����
		if(this==obj)
		return true;
		//�Ƿ���ͬһ�����
		boolean res=obj instanceof Person;
		//��boolean res=obj.getClass()==Person.class;
		if(res){//ͬ��  �Ƚ�����
			Person t=(Person)obj;
			if(this.name==t.name&&this.age==t.age)
			return true;
			else 
			return false;
		}else{
			return false;
		}
	}
}
public class Test{
	public static void main(String[] args){
		Test test=new Test();
		Person p=new Person("��",24);
		Person p1=new Person("����",13);
		Person p2=p1;
		System.out.println(test.getClass());
		//ֱ�Ӵ�ӡ�����Ĭ�ϵ���toString����
		System.out.println(test.toString());
		System.out.println("equals():"+p.equals(p1)+"\t=="+(p==p1));
		System.out.println("equals():"+p2.equals(p1)+"\t=="+(p2==p1));
	}
}