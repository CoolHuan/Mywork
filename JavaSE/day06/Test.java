import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		School sch=new School();
		System.out.println("请输入要执行的功能");
		System.out.println("1.添加一个老师");
		System.out.println("2.添加一个学生");
		System.out.println("3.添加一个班主任");
		int num=in.nextInt();
		if(num==1){
			System.out.println("请输入姓名");
			String name=in.next();
			System.out.println("请输入年龄");
			int age=in.nextInt();
			System.out.println("请输入学科");
			String subject=in.next();
			System.out.println("请输入月薪");
			int salary=in.nextInt();
			System.out.println("请输入编号");
			int on=in.nextInt();
			sch.adminTeacher(name,age,subject,salary,on);
		}if(num==2){
			System.out.println("请输入姓名");
			String name=in.next();
			System.out.println("请输入年龄");
			int age=in.nextInt();
			System.out.println("请输入年级");
			String grade=in.next();
			System.out.println("请输入班级");
			int clas=in.nextInt();
			System.out.println("请输入编号");
			int on=in.nextInt();
			sch.adminStudent(name,age,grade,clas,on);
		}
	}
}