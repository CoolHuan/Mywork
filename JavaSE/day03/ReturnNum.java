import java.util.*;
public class ReturnNum{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ��1��9999֮�����");
		int num=in.nextInt();
		//  ��򵥴ֱ��ķ���
		String str=String.valueOf(num);
		System.out.println(num+"��һ��"+str.length()+"λ��");
		String returnstr=new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(returnstr)){
			System.out.println(num+"��һ��������");
		}else{
			System.out.println(num+"����һ��������");
		}
		
		
		
	}
}