import java.util.*;
public class Book{
		private String name;  //权限修饰符不能作用于main方法中   name 是成员变量
		public String getName(){
			int id=0;			//	id 是局部变量
			setName("Java");    //调用本类中的setName方法
			return id+this.name;
		}
		private void setName(String name){
			this.name=name;     //就是将形参name的值赋予成员变量name
		} 
	public static void main(String args[]){
		Book a=new Book();
		System.out.println(a.getName());
	}
}
