import java.util.*;
public class SwitchTest{
	public static void main(String[] args){
		System.out.println("����ϲ��������");
		Scanner in=new Scanner(System.in);
		String car=in.next();//��ȡ�ĵ��� nextInt() nextLine();
		switch(car){
			case "BMW":
				System.out.println("����");
				break;
			case "QQ":
				System.out.println("��˿");
				break;
			case "Benz":
				System.out.println("˧��");
				break;
			default:
				System.out.println("��ͨ");
				break;
		}
	}
}