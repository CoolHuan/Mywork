import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		School sch=new School();
		System.out.println("������Ҫִ�еĹ���");
		System.out.println("1.���һ����ʦ");
		System.out.println("2.���һ��ѧ��");
		System.out.println("3.���һ��������");
		int num=in.nextInt();
		if(num==1){
			System.out.println("����������");
			String name=in.next();
			System.out.println("����������");
			int age=in.nextInt();
			System.out.println("������ѧ��");
			String subject=in.next();
			System.out.println("��������н");
			int salary=in.nextInt();
			System.out.println("��������");
			int on=in.nextInt();
			sch.adminTeacher(name,age,subject,salary,on);
		}if(num==2){
			System.out.println("����������");
			String name=in.next();
			System.out.println("����������");
			int age=in.nextInt();
			System.out.println("�������꼶");
			String grade=in.next();
			System.out.println("������༶");
			int clas=in.nextInt();
			System.out.println("��������");
			int on=in.nextInt();
			sch.adminStudent(name,age,grade,clas,on);
		}
	}
}