import java.util.*;
public class ReturnNum{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个1—9999之间的数");
		int num=in.nextInt();
		//  最简单粗暴的方法
		String str=String.valueOf(num);
		System.out.println(num+"是一个"+str.length()+"位数");
		String returnstr=new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(returnstr)){
			System.out.println(num+"是一个回文数");
		}else{
			System.out.println(num+"不是一个回文数");
		}
		
		
		
	}
}