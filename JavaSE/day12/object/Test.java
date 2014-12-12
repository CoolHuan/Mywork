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
		return "姓名："+this.name+"\t年龄:"+this.age;
	}
	//同一类对象  属性？
	public boolean equals(Object obj){
		//是否指向同一对象？
		if(this==obj)
		return true;
		//是否是同一类对象？
		boolean res=obj instanceof Person;
		//或boolean res=obj.getClass()==Person.class;
		if(res){//同类  比较属性
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
		Person p=new Person("大华",24);
		Person p1=new Person("二华",13);
		Person p2=p1;
		System.out.println(test.getClass());
		//直接打印对象会默认调用toString方法
		System.out.println(test.toString());
		System.out.println("equals():"+p.equals(p1)+"\t=="+(p==p1));
		System.out.println("equals():"+p2.equals(p1)+"\t=="+(p2==p1));
	}
}