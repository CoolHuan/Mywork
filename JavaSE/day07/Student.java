public class Student{ 
	//Student ���speak()�������׳��Զ����쳣
	static void speak(int m)throws MyException{  
	
		//�жϷ����в����Ƿ���������
		if(m>1000)
		//�׳�һ��MyException�쳣����
		throw new MyException("m�����Դ���1000");
	}
}