public class IntTest{
	public static void main(String[] args){
		//���ͳ���Ĭ���Զ�ת��int����
		int num=888;
		//�����γ��������Զ�ת��long����
		//long long1=88888888888888888;error
		long long1=88888888888888888L;
		long long2=88888888888888888l;	//	�����Ǵ�дL
		System.out.println(long1);
		
		//�˽��Ʊ�ʾ���ͣ���0��ͷ
		int var=013;
		System.out.println("var:"+var);
		//ʮ�����Ʊ�ʾ���ͣ���0x��0X��ͷ
		int hexNum=0xFF;
		int hexNum1=0X1F;
		System.out.println("hexNum:"+hexNum+"\n hexNum1:"+hexNum1);
		//�����Ʊ�ʾ����0b,0B��ͷe
		byte byteNum=(byte)0b1111111;
		int intNum=0b1111111;
		System.out.println("intNum:"+intNum+"\n byteNum:"+byteNum);
	
	}
}