public class Student{ 
	//Student 类的speak()方法中抛出自定义异常
	static void speak(int m)throws MyException{  
	
		//判断方法中参数是否满足条件
		if(m>1000)
		//抛出一个MyException异常对象
		throw new MyException("m不可以大于1000");
	}
}