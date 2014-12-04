public class ArrayTool{								//定义一个数组工具类
	public static void getMax(int[] arr){          //求int数组的最大值
		int max=arr[0];
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("此数组的最大值为："+max);
	}
	
		public static void getMin(int[] arr){			//求int数组的最小值
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("此数组的最小值为："+min);
	}
	
	public static void BubbleSort(int[] arr){		//冒泡排序法
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
						int t=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=t;
				}
			}
		}
	}
	public static void SelectSort(int[] arr){		//选择排序法
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]>arr[j]){
						int t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
				}
			}
		}
	}
	public static void sub(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	} 
	public static void main(String[] args){
		int[] arr={110,8,254,84,54,45,87,67};
		ArrayTool.getMax(arr);
		ArrayTool.getMin(arr);
		ArrayTool.BubbleSort(arr);
		ArrayTool.sub(arr);
	}
	
}