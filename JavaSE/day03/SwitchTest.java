import java.util.*;
public class SwitchTest{
	public static void main(String[] args){
		System.out.println("输入喜欢的汽车");
		Scanner in=new Scanner(System.in);
		String car=in.next();//读取的单词 nextInt() nextLine();
		switch(car){
			case "BMW":
				System.out.println("土豪");
				break;
			case "QQ":
				System.out.println("屌丝");
				break;
			case "Benz":
				System.out.println("帅哥");
				break;
			default:
				System.out.println("普通");
				break;
		}
	}
}