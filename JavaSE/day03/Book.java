import java.util.*;
public class Book{
		private String name;  //Ȩ�����η�����������main������   name �ǳ�Ա����
		public String getName(){
			int id=0;			//	id �Ǿֲ�����
			setName("Java");    //���ñ����е�setName����
			return id+this.name;
		}
		private void setName(String name){
			this.name=name;     //���ǽ��β�name��ֵ�����Ա����name
		} 
	public static void main(String args[]){
		Book a=new Book();
		System.out.println(a.getName());
	}
}
