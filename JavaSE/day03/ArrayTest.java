// 变量：只能存放一个数据
//数组：存放同种数据类型【基本数据类型、引用数据类型】的元素：下标的范围【0,N-1】
//特点：1、随机访问能力强 2、长度固定 3、移动数据的效率低
public class ArrayTest{
	public static void main(String[] args){
		//声明数组:变量在栈空间：函数中变量：局部变量、形参
	//	int[] arr;   //建议使用这种
		//int arr1[];
		// int test[10]; //error
		// 声明数组时，不可以指定数组大小
		
		//初始化：必须指定大小【显式、隐式】创建空间
		//创建空间+初始化值=在堆空间存储
		int arr[]=new int[10];
		int arr1[]={1,2,4};
		
		//声明+初始化
		String[] str=new String[5]; //默认初始化：动态初始化
		int[] arrInt=new int[]{123,456,678};
		String[] IT={"Java","C","C++","Android"}; //简写
		//匿名数组=0引用：数组只是使用一次情况
		System.out.println((new String[]{"Apple","Google","Alibaba","Tesla"})[2]);
		
		
		
		//使用数组
		System.out.println("IT[0]="+IT[0]);
		//完成数组的遍历
		//for+数组长度
		for(int i=0;i<IT.length;i++){
			System.out.println(IT[i]);
		}
		//for each:遍历数组、集合
		for(String ele:IT){
			System.out.println("IT"+ele);
		}
		//数组拷贝
		String[] it_copy=IT;
		for(String ele:it_copy){
			System.out.println("IT"+ele);
		}
		System.out.println("");
		it_copy[0]="python";
		//for(String ele:it_copy){
		//	System.out.println("IT"+ele);
		//}
		for(String ele:IT){
			System.out.println("IT"+ele);   //多个引用（拷贝的）指向同一个空间。
		}
			System.out.println("");
		//命令行
		for(String str1: args){
			System.out.println(str1);
		}
	}
}