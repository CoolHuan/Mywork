//数组：存放同种数据类型的元素：下标的范围【0,N-1】
public class ArrayTest{
	public static void main(String args[]){
		//声明数组:变量在栈空间
	//	int[] arr;   //建议使用这种
		//int arr1[];
		// int test[10];
		// 声明数组时，不可以指定大小
		
		//初始化：在对空间存储
		int arr[]=new int[10];
		int arr1[]={1,2,4};
		
		//声明+初始化
		String[] str=new String[5]; //默认初始化
		int[] arrInt=new int[]{123,456,678};
		String[] IT={"Java","C","C++","Android"}; //简写
		
		//完成数组的遍历
		for(int i=0;i<IT.length;i++){
			System.out.println(IT[i]);
		}
	}
}