import java.util.*;
public class ArrayTest{
		//ѭ������λ�����ÿ��Ԫ�ظ�ֵ0-100�������
	public static void main(String[] args){
		int[][] arr=new int[5][20];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=(int)(Math.random()*100);
			}
		}
		System.out.println("��ֵ�ɹ�");
	
		//�����б�ķ�ʽ�����ЩѧԱÿ�ſεĳɼ�
	
		System.out.println("c++\tjava\tServlet\tJSP\tEJB");
		
		for(int j=0;j<20;j++){
			for(int i=0;i<arr.length;i++){
					System.out.print(arr[i][j]+"\t");
			}	
			System.out.println("");
		}
	//��ÿ��ѧԱ���ܷ֣������䱣������һ�������У�	
		System.out.println("");
		int[] arr1=new int[20];
		for(int j=0;j<20;j++){
			for(int i=0;i<arr.length;i++){
				arr1[j]+=arr[i][j];
			}				
		}
		System.out.println("ÿ��ѧԱ���ܷ�Ϊ��");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	//������ѧԱĳ�ſε�ƽ����
		System.out.println("��ѡ��γ�����");
		System.out.println("0.C++ 1.java 2.Servlet 3.JSP 4.EJB");
		int a=in.nextInt();
		int sum=0; 
		int avg;
		for(int i=0;i<arr[a].length;i++){
			sum+=arr[a][i];
		}
		avg=sum/arr[a].length;
		System.out.println("��ô�ε�ƽ���ɼ�Ϊ"+avg);
	}
	
}