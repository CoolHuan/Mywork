public class Test{
	public static void main(String[] args){
		//�̳е�����ת��VS�ӿڡ�ʵ���������ת��
		//USB JP=new USB_KEY(); Ҳ�ǿ��Եġ�
		//����Ҫ����ʵ��������������Ҫ����ת��
		USB_KEY JP=new USB_KEY();
		Udisk UP=new Udisk();
		JP.read();
		JP.write();
		System.out.println("���̵�Ʒ���ǣ�"+JP.brand);
		UP.read();
		UP.write();
		System.out.println("U�̵�Ʒ���ǣ�"+UP.brand);
	}
}