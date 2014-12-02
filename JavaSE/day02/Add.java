import java.util.*;
public class Add{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("请输入分数");
	/*	int a=0;
		int a1=0;					
		System.out.println(++a);
		System.out.println(--a1);//先运算，再取值
		int b=0;
		int b1=0;
		System.out.println(b++);
		System.out.println(b1--);//先取值，再运算
	*/
		int score=in.nextInt();
		int x=-100;
		String type=score<60?"不及格":"及格";
		int flag=x>0?1:(x==0?0:-1);
		System.out.println("type="+type);
		System.out.println("flag="+flag);
	}
}