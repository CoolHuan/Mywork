public class ExceptionTest{
	public static void main(String[] args){
		Student stu=new Student();
		//��ѧ�����������speak()�������ܳ����쳣
		try{
			stu.speak(2000);			
		}catch(MyException e){  //��׽�쳣����쳣����
			System.out.println(e);
		}
	}
}