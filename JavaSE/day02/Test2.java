import java.util.*;
class PdNum{
public static void check(int i){
		if(i%2==0){
		System.out.println("i��ż��");
		}else{
		System.out.println(i+"������");
		}
}
}
public class Test2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("����������x");
		int x=in.nextInt();
		PdNum.check(x);
		
	}
}