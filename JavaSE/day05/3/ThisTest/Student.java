public class Student{
	String name;
	public Student(String name){
		this.name=name;
	}
	//成员方法
	Student get(){
		return this;	//返回对象引用的地址
	}
	public static void main(String[] args){
		Student s1=new Student("哈哈");
		Student s2=new Student("呵呵");
		
		System.out.println(s1);
		System.out.println(s1.get().name);
		
		System.out.println(s2);
		System.out.println(s2.get().name);
	}
}