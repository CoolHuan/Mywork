import org.omg.CORBA.SystemException;

class Test1{
		void run(int[] arr,int index){
			//自动抛异常： JVM---new---throw--->main--->JVM--->控制台
			//
			if(index<0){
				throw new ArrayIndexOutOfBoundsException("下标为负");
			}else if(index>=arr.length){
				throw new ArrayIndexOutOfBoundsException("index>=数组长度"+arr.length);
			} else if(arr==null){
				throw new NullPointerException("空指针异常");
			}else{
			System.out.println(arr[index]);
			}
		}
}
public class ExceptionDemo {
	//演示一下跑出异常的流程
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] arr=new int[5];	
		int[] array=null;
	//	arr[5]=1232;		//ArrayIndexOutOfBoundsException
		
		//array[0]=123;	}try{	catch(Exception e){
	//		System.out.println("java.lang.NullPointerException");
		//}
		Test1 test=new Test1();
	//	test.run(arr,-2);
		//test.run(arr, 5);
		
		test.run(array,1);
	}

}
