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
	System.out.println("管理班主任的方法");
	}
	public void print(){
		System.out.println("编号\t"+"姓名\t"+"年龄\t"+"科目\t"+"月薪");
	}
	public void print1(){
		System.out.println("编号\t"+"姓名\t"+"年龄\t"+"年级\t"+"班级");
	}
}