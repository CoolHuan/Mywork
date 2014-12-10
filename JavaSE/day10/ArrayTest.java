import java.util.*;
public class ArrayTest{
		//循环给二位数组的每个元素赋值0-100随机整数
	public static void main(String[] args){
		int[][] arr=new int[5][20];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=(int)(Math.random()*100);
			}
		}
		System.out.println("赋值成功");
	
		//按照列表的方式输出这些学员每门课的成绩
	
		System.out.println("c++\tjava\tServlet\tJSP\tEJB");
		
		for(int j=0;j<20;j++){
			for(int i=0;i<arr.length;i++){
					System.out.print(arr[i][j]+"\t");
			}	
			System.out.println("");
		}
	//求每个学员的总分，并将其保留在另一个数组中；	
		System.out.println("");
		int[] arr1=new int[20];
		for(int j=0;j<20;j++){
			for(int i=0;i<arr.length;i++){
				arr1[j]+=arr[i][j];
			}				
		}
		System.out.println("每个学员的总分为：");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	//求所有学员某门课的平均分
		System.out.println("请选择课程名：");
		System.out.println("0.C++ 1.java 2.Servlet 3.JSP 4.EJB");
		int a=in.nextInt();
		int sum=0; 
		int avg;
		for(int i=0;i<arr[a].length;i++){
			sum+=arr[a][i];
		}
		avg=sum/arr[a].length;
		System.out.println("这么课的平均成绩为"+avg);
	}
	
}