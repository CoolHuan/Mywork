public class BooleanTest{
	public static void main(String[] args){
		boolean flag;
		flag=true;
		//��true�� ��false��
		//boolean flag=0  //error
		if(flag){
			System.out.println("��");
		}else{
			System.out.println("��");	
		}
		String str=true+""+"\teasy";//ʹ��boolean���ַ��������������㡣boolean���Զ�ת�����ַ���
		System.out.println("str="+str);
	}
}