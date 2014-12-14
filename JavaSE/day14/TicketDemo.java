/*
需求：简单的卖票程序
多个窗口同时卖票。

创建线程的第二种方式：实现Runable接口
步骤：
1.定义类实现Runnable接口
2.覆盖Runnable接口中的run方法
3.通过Thread类建立线程对象
4.将Runnable接口的子类对象作为实际参数传递给Thread类的构造方法
5.调用Thread类的start方法开启并调用Runnable接口的子类的run方法

实现方式和继承方式有什么区别呢？
实现方式好处：避免了单继承的局限性。
在定义线程时，建议使用实现方式。

两种方式区别：
继承Thread：线程代码存放Thread子类run方法中。
实现Runnable，线程代码存在接口的子类的run方法中。

*/

/*

通过分析，发现，打印出0，-1，-2等错票
多线程的运行出现了安全问题

问题的原因：
	当多条语句在操作同一个线程共享数据时，一个线程对多条语句执行了一部分，还没有执行完，
	另一个线程参与进来执行，导致共享数据的错误

解决办法：对多条操作共享数据的语句，只能让一个线程都执行完。在执行过程了，其他线程不可以参与执行。

java对多线程的安全问题提供了专业的解决方式
就是同步代码块
synchronized(对象){
	需要被同步的代码
}
对象如同锁，持有锁的线程可以再同步中执行
没有持有锁的线程即便获取cpu的执行权 也进不去，因为没有获取锁。

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