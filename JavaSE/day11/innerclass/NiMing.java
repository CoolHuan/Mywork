//������=====����̳�=====ʵ��������
//�ӿ�====="ʵ����"======ʵ��������
//2-3�����󷽷�����ʹ�������ڲ���

//������
abstract class USB{
	public abstract void read();
	public abstract void write();

}
//�ӿ�
interface Wifi{
	void open();
	void close();
}
/*
class USB_KEY extends USB{
	//�ص�
	//����
	//��д
}
*/
public class NiMing{
	public static void main(String[] args){
		//�����ڲ���==����ľֲ��ڲ���==����Ķ��� ���� ʵ����Ķ���
		USB udisk=new USB(){
			public void read(){
				System.out.println("��ȡU��");
			}
			public void write(){
				System.out.println("дU��");
			}
		
		};
		udisk.read();
		udisk.write();
		
		Wifi mi=new Wifi(){
			public void open(){
				System.out.println("��wifi");
			}
			public void close(){
				System.out.println("�ر�wifi");
			}
		};
		mi.open();
		mi.close();
	}
}