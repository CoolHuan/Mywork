/*
�������˴����������Ľӿڡ�����֮�󣬿���Ϊ�ýӿڴ���ʵ���࣬
��Ӹø����������࣬����Ҫָ�����ǣ���ʹ����Щ�ӿڡ�����ʱ
�����ٰ��������β�//class A extends Apple<T>{}��仰�������
Ҫ�������βδ���ʵ�����͵�ֵ
*/
class A extends Apple<String>{
}
//����Apple��ʱ ʹ���˷�������
public class Apple<T>{
	//ʹ��T�����βζ���ʵ������
	private T info;
	public Apple(){}
	//���淽����ʹ��T�����β������幹����
	public Apple(T info){
		this.info=info;
	}
	public void setInfo(T info){
		this.info=info;
	}
	public T getInfo(){
		return this.info;
	}
	public static void main(String[] args){
		Apple<String> a1=new Apple<>("ƻ��");
		System.out.println(a1.getInfo());
		Apple<Integer> a2=new Apple<>(555);
		System.out.println(a2.getInfo());
	}
}