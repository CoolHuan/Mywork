//���ʶ�������Ժ���Ϊ�������ڶ��ڴ������໥�����ġ��ı�һ������ĳ�Ա��������Ӱ����һ������ĳ�Ա������
//���ϣ����Ա�������������κ�һ������ı䣬����ʹ��static�ؼ��֡�
public class AccessProperty{
	static int i=47;
	public void call(){
		System.out.println("����call()����");
		for(i=0;i<3;i++){
			System.out.println(i+"");
			if(i==2){
			System.out.println("\n");
			}
		}
	}
	public AccessProperty(){
	} 
	public static void main(String[] args){
		AccessProperty t1=new AccessProperty();
		AccessProperty t2=new AccessProperty();
		t1.i=60;
		System.out.println("��һ��ʵ����������i�Ľ��Ϊ��"+t1.i);
		//t1.call();     	// �˴�����call()������ı侲̬����i��ֵ��
		System.out.println("�ڶ���ʵ����������i�Ľ��Ϊ��"+t2.i);
		t2.call();
	}
}