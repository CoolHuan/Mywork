/*
���󣺼򵥵���Ʊ����
�������ͬʱ��Ʊ��

�����̵߳ĵڶ��ַ�ʽ��ʵ��Runable�ӿ�
���裺
1.������ʵ��Runnable�ӿ�
2.����Runnable�ӿ��е�run����
3.ͨ��Thread�ཨ���̶߳���
4.��Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��췽��
5.����Thread���start��������������Runnable�ӿڵ������run����

ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�
ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��

���ַ�ʽ����
�̳�Thread���̴߳�����Thread����run�����С�
ʵ��Runnable���̴߳�����ڽӿڵ������run�����С�

*/

/*

ͨ�����������֣���ӡ��0��-1��-2�ȴ�Ʊ
���̵߳����г����˰�ȫ����

�����ԭ��
	����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִ����һ���֣���û��ִ���꣬
	��һ���̲߳������ִ�У����¹������ݵĴ���

����취���Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���ꡣ��ִ�й����ˣ������̲߳����Բ���ִ�С�

java�Զ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ
����ͬ�������
synchronized(����){
	��Ҫ��ͬ���Ĵ���
}
������ͬ�������������߳̿�����ͬ����ִ��
û�г��������̼߳����ȡcpu��ִ��Ȩ Ҳ����ȥ����Ϊû�л�ȡ����

*/
class Ticket implements Runnable{//extends Thread{
	private int tick=400;
	Object obj=new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(tick>0){
				try{Thread.sleep(10);}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"sale:"+tick--);	
				}
			}				
		}	
	}
}
class TicketDemo{
	public static void main(String[] args){		
		Ticket t=new Ticket();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
	
		/*
		Ticket t1=new Ticket();		
		Ticket t2=new Ticket();		
		Ticket t3=new Ticket();		
		Ticket t4=new Ticket();		*/
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}