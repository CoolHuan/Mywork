// ������ֻ�ܴ��һ������
//���飺���ͬ���������͡������������͡������������͡���Ԫ�أ��±�ķ�Χ��0,N-1��
//�ص㣺1�������������ǿ 2�����ȹ̶� 3���ƶ����ݵ�Ч�ʵ�
public class ArrayTest{
	public static void main(String[] args){
		//��������:������ջ�ռ䣺�����б������ֲ��������β�
	//	int[] arr;   //����ʹ������
		//int arr1[];
		// int test[10]; //error
		// ��������ʱ��������ָ�������С
		
		//��ʼ��������ָ����С����ʽ����ʽ�������ռ�
		//�����ռ�+��ʼ��ֵ=�ڶѿռ�洢
		int arr[]=new int[10];
		int arr1[]={1,2,4};
		
		//����+��ʼ��
		String[] str=new String[5]; //Ĭ�ϳ�ʼ������̬��ʼ��
		int[] arrInt=new int[]{123,456,678};
		String[] IT={"Java","C","C++","Android"}; //��д
		//��������=0���ã�����ֻ��ʹ��һ�����
		System.out.println((new String[]{"Apple","Google","Alibaba","Tesla"})[2]);
		
		
		
		//ʹ������
		System.out.println("IT[0]="+IT[0]);
		//�������ı���
		//for+���鳤��
		for(int i=0;i<IT.length;i++){
			System.out.println(IT[i]);
		}
		//for each:�������顢����
		for(String ele:IT){
			System.out.println("IT"+ele);
		}
		//���鿽��
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
			System.out.println("IT"+ele);   //������ã������ģ�ָ��ͬһ���ռ䡣
		}
			System.out.println("");
		//������
		for(String str1: args){
			System.out.println(str1);
		}
	}
}