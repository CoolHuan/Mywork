public class School{
	public void adminTeacher(String name,int age,String subject,int salary ,int on){
		print();
		Teacher t=new Teacher();
		t.setOn(on);
		t.setName(name);
		t.setAge(age);
		t.setSubject(subject);
		t.setSalary(salary);
		t.print(t);
		t.work();
	}
	
	public void adminStudent(String name,int age,String grade,int clas,int on){
		print1();
		Student stu=new Student();
		stu.setName(name);
		stu.setOn(on);
		stu.setAge(age);
		stu.setGrade(grade);
		stu.setClas(clas);
		stu.print(stu);
		stu.work();
	}
	public void adminHeadMaster(){
	System.out.println("��������εķ���");
	}
	public void print(){
		System.out.println("���\t"+"����\t"+"����\t"+"��Ŀ\t"+"��н");
	}
	public void print1(){
		System.out.println("���\t"+"����\t"+"����\t"+"�꼶\t"+"�༶");
	}
}