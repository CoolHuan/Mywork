//����������ʵ��Card�ӿ�
public class Computer implements Card{
	public void run(){
		System.out.println("Card run");
	}
	public void close(){
		System.out.println("Card close");
	}
	public static void main(String[] args){
		Computer cp=new Computer();
		System.out.println("PCI�ӿڴ�СΪ"+PCI.size);
		System.out.println("�Կ����ͣ�"+cp.type);
		System.out.println("�Կ��۸�"+cp.price);
		cp.run();
		cp.close();
	}
}
