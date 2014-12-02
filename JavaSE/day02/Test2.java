import java.util.*;
class PdNum{
public static void check(int i){
		if(i%2==0){
		System.out.println("i是偶数");
		}else{
		System.out.println(i+"是奇数");
		}
}
}
public class Test2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入整数x");
		int x=in.nextInt();
		PdNum.check(x);
		
	}
}