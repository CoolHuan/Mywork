public class FloatTest{
	public static void main(String[] args){
		//����Ĭ��ת���ɸ�����
		float floatNum=123;
		System.out.println("floatNum"+floatNum);
		//�������ͳ���Ĭ��Ϊ��double����
		//float floatNum1=3.14;   //error
		float floatNum1=3.14f;   // f��F
		float floatNum2=3.14e2f;
	
		float sum=(float)(floatNum+floatNum1+321+3.14);
		System.out.println("sum:"+sum);
		System.out.println('a');
		System.out.println('a'+1);
		byte b=3;
		b=(byte)(b+4);
		// b=b+(byte)4;  //���ܶԳ�������ǿת
		byte b1=3,b2=4,b3;
		//b3=b1+b2;
		b3=(byte)(b1+b2);
		b3=3+4;
		long b4=123l;
		byte b5=(byte)b4;
		System.out.println(b5);
	}
}