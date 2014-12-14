/*
进程：是一个正在执行中的程序
	每一个进程执行都是一个执行顺序。该顺序是一个执行路径。或者叫一个控制单元。
线程：就是进程中的一个独立控制单元。线程在控制着进程的执行。
一个进程中至少有一个线程

java VM 启动的时候会有一个java.exe.
该进程中至少有一个线程负责java程序的执行
而且这个线程运行的代码存在于main方法中
该线程称为主线程

创建线程的一种方式：继承Thread类
步骤：
1.定义类继承Thread
2.复写Thread类中的run方法。
		目的：将自定义的代码存储在run方法中，让线程运行。
3.调用线程的start方法，
	该方法有2个作用：1.启动线程 2.调用run()方法。 

发现运行结果每一次都不同。
因为多个线程都获取cpu的执行权。cpu执行到谁，谁就运行。
明确一点，在某一个时刻，只有一个程序在运行。（多核除外）
cpu在做着快速的切换，以达到看上去同时运行的效果。
我们可以形象的把多线程的运行行为在互相抢夺cpu的执行权

这就是多线程的一个特性：随机性，谁抢到谁执行，至于执行多上，cpu说的算。	
	
*/

class Demo extends Thread{
	public void run(){
		for(int x=0; x<60;x++){
			System.out.println("demo run"+x);
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		//for(int x=0;x<4000;x++)
		//System.out.println("Hello world");
		Demo d=new Demo();
		d.start();//必须通过start方法才能真正开启另一个线程并执行该线程的run方法
		for(int x=0;x<60;x++)
			System.out.println("Hello World"+x);
	}
}