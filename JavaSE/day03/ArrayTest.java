//���飺���ͬ���������͵�Ԫ�أ��±�ķ�Χ��0,N-1��
public class ArrayTest{
	public static void main(String args[]){
		//��������:������ջ�ռ�
	//	int[] arr;   //����ʹ������
		//int arr1[];
		// int test[10];
		// ��������ʱ��������ָ����С
		
		//��ʼ�����ڶԿռ�洢
		int arr[]=new int[10];
		int arr1[]={1,2,4};
		
		//����+��ʼ��
		String[] str=new String[5]; //Ĭ�ϳ�ʼ��
		int[] arrInt=new int[]{123,456,678};
		String[] IT={"Java","C","C++","Android"}; //��д
		
		//�������ı���
		for(int i=0;i<IT.length;i++){
			System.out.println(IT[i]);
		}
	}
}