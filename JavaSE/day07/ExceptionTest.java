public class ExceptionTest{
	public static void main(String[] args){
		Student stu=new Student();
		//用学生对象调用其speak()方法可能出现异常
		try{
			stu.speak(2000);			
		}catch(MyException e){  //捕捉异常输出异常对象
			System.out.println(e);
		}
	}
}