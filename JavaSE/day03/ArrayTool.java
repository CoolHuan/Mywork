public class ArrayTool{								//����һ�����鹤����
	public static void getMax(int[] arr){          //��int��������ֵ
		int max=arr[0];
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("����������ֵΪ��"+max);
	}
	
		public static void getMin(int[] arr){			//��int�������Сֵ
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("���������СֵΪ��"+min);
	}
	
	public static void BubbleSort(int[] arr){		//ð������
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
	public static void SelectSort(int[] arr){		//ѡ������
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